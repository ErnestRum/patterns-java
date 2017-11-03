package com.rum.patterns.factorymethod.factory;

import com.rum.patterns.factorymethod.products.Textbox;

public abstract class GUICreator {

    public void renderTextbox() {
        Textbox textbox = createTextbox();
        textbox.render();
    }

    public abstract Textbox createTextbox();
}
