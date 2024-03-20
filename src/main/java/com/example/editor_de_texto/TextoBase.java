package com.example.editor_de_texto;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class TextoBase implements ComponenteTexto {
    private String texto;

    public TextoBase(String texto) {
        this.texto = texto;
    }

    @Override
    public Font decorate(Font font) {
        return null;
    }

//    @Override
//    public String getTextoFormateado() {
//        return texto;
//    }
}
