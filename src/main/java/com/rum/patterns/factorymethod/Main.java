package com.rum.patterns.factorymethod;

import com.rum.patterns.factorymethod.factory.GUICreator;
import com.rum.patterns.factorymethod.factory.MacGUICreator;
import com.rum.patterns.factorymethod.factory.WindowsGUICreator;
import com.rum.patterns.factorymethod.products.Textbox;

public class Main {

    private GUICreator guiCreator;
    private Textbox textbox;

    private void initMacUI() {
        guiCreator = new MacGUICreator();
        textbox = guiCreator.createTextbox();
    }

    private void initWindowsUI() {
        guiCreator = new WindowsGUICreator();
        textbox = guiCreator.createTextbox();
    }

    private void runMain() {
        System.out.println("----------Windows UI----------");
        initWindowsUI();
        guiCreator.renderTextbox();

        System.out.println("----------MacOS UI----------");
        initMacUI();
        guiCreator.renderTextbox();
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
