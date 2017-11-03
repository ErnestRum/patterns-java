package com.rum.patterns.factorymethod.products;

public class MacTextbox implements Textbox {

    @Override
    public void render() {
        System.out.println("Rendering MacOS textbox...");
    }

}
