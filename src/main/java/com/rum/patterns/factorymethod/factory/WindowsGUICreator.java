package com.rum.patterns.factorymethod.factory;

import com.rum.patterns.factorymethod.products.Textbox;
import com.rum.patterns.factorymethod.products.WindowsTextbox;

public class WindowsGUICreator extends GUICreator {

    @Override
    public Textbox createTextbox() {
        return new WindowsTextbox();
    }

}
