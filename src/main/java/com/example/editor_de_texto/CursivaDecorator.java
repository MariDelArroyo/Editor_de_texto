package com.example.editor_de_texto;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class CursivaDecorator implements DecoradorTexto {
    private ComponenteTexto componenteTexto;
   // private FontType fontType; // Agregar una instancia de FontType

    public CursivaDecorator() {
        this.componenteTexto = componenteTexto;
        //this.fontType = fontType; // Establecer el tipo de fuente

    }
    @Override
    public Font decorate(Font font) {
        return Font.font(font.getFamily(), FontPosture.ITALIC, font.getSize());
    }




}

