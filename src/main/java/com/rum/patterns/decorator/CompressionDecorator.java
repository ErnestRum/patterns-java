package com.rum.patterns.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
        System.out.print(" Data compressed.");
    }

    @Override
    public String readData() {
        super.readData();
        System.out.print(" Data decompressed.");
        return null;
    }

}
