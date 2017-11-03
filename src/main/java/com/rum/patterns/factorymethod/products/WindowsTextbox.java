package com.rum.patterns.factorymethod.products;

public class WindowsTextbox implements Textbox {

    @Override
    public void render() {
        System.out.println("Rendering Windows textbox...");
    }

}
