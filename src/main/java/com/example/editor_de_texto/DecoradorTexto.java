package com.example.editor_de_texto;
import javafx.scene.text.Font;

public interface DecoradorTexto extends ComponenteTexto {
//    String getTextoFormateado();
    Font decorate(Font font);

}
