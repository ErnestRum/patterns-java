package com.rum.patterns.chain.authorization;

public class BandwidthChain extends BaseChain {

    private int requestCount;
    private int requestPerMinute;
    private long currentTime;

    public BandwidthChain(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
        this.requestCount = 0;
    }

    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60L) {
            requestCount = 0;
            currentTime = System.currentTimeMillis();
        }

        requestCount++;
        if (requestCount > requestPerMinute) {
            System.out.println("Query limit exceeded.");
            return false;
        }

        return checkNext(email, password);
    }

}
