package com.rum.patterns.decorator;

public class Main {

    private DataSource dataSource;

    private void runMain() {
        dataSource = new FileDataSource();
        System.out.println("----------Basic file input/output----------");
        dataSource.writeData("data");
        dataSource.readData();

        dataSource = new CompressionDecorator(new FileDataSource());
        System.out.println("\n\n----------File input/output with compression----------");
        dataSource.writeData("data");
        dataSource.readData();

        dataSource = new EncryptionDecorator(new CompressionDecorator(new FileDataSource()));
        System.out.println("\n\n----------File input/output with compression and encryption----------");
        dataSource.writeData("data");
        dataSource.readData();
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
