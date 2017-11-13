package com.rum.patterns.chain.authorization;

public abstract class BaseChain {

    private BaseChain next;

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }

        return next.check(email, password);
    }

    public BaseChain linkWith(BaseChain next) {
        this.next = next;
        return this.next;
    }

    public abstract boolean check(String email, String password);

}
