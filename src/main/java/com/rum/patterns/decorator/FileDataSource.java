package com.rum.patterns.decorator;

public class FileDataSource implements DataSource {

    @Override
    public void writeData(String data) {
        System.out.print("Writing data to file.");
    }

    @Override
    public String readData() {
        System.out.print("Reading data from file.");
        return null;
    }

}
