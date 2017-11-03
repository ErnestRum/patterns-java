package com.rum.patterns.factorymethod.factory;

import com.rum.patterns.factorymethod.products.MacTextbox;
import com.rum.patterns.factorymethod.products.Textbox;

public class MacGUICreator extends GUICreator {

    @Override
    public Textbox createTextbox() {
        return new MacTextbox();
    }

}
