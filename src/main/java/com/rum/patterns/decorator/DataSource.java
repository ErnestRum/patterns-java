package com.rum.patterns.decorator;

public interface DataSource {

    void writeData(String data);

    String readData();

}
