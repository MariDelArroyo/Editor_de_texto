module com.example.editor_de_texto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.fxmisc.richtext;
    requires java.desktop;


    opens com.example.editor_de_texto to javafx.fxml;
    exports com.example.editor_de_texto;
}