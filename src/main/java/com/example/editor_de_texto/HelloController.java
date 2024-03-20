package com.example.editor_de_texto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
//import org.fxmisc.richtext.InlineCssTextArea;
import javafx.scene.text.Font;
public class HelloController {

    @FXML
    private Button botoncursiva;

    //@FXML
   // private InlineCssTextArea texto;

   private boolean enCursiva = false;
    private DecoradorTexto fontDecorator;
    private Font fontNormal;

    @FXML
    private TextArea textArea;

    @FXML
    void onCursivaButtonClick(ActionEvent event) {

        int inicioselec = textArea.getSelection().getStart();
        int finselec = textArea.getSelection().getEnd();
        String valor = textArea.getSelectedText();
        System.out.println(valor);
        // Si no hay selección, no hacemos nada
        if (inicioselec == finselec) {
            return;
        } else {

        Font fontSeleccion = textArea.getFont();
        String textoSeleccionado = textArea.getSelectedText();

        if (enCursiva) {
            textArea.setFont(Font.font(textoSeleccionado));
            enCursiva = false;
        } else {
            fontNormal = textArea.getFont();
            fontDecorator = new CursivaDecorator();
            Font nuevaFuente = fontDecorator.decorate(fontSeleccion);
            textArea.setFont(nuevaFuente);
            enCursiva = true;
        }

        // Aplicamos la fuente al texto seleccionado
        textArea.selectRange(inicioselec, finselec);
    }
        }
}


