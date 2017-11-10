package com.rum.patterns.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
        System.out.print(" Data encrypted.");
    }

    @Override
    public String readData() {
        super.readData();
        System.out.print(" Data decrypted.");
        return null;
    }

}
