package com.example.editor_de_texto;

import javafx.scene.text.Font;

public class NegritaDecorator implements DecoradorTexto {
    private ComponenteTexto componenteTexto;

    public NegritaDecorator(ComponenteTexto componenteTexto) {
        this.componenteTexto = componenteTexto;
    }

//    @Override
//    public String getTextoFormateado() {
//        return "<b>" + componenteTexto.getTextoFormateado() + "</b>";
//    }

    @Override
    public Font decorate(Font font) {
        return null;
    }
}
