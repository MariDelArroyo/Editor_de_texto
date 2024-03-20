package com.example.editor_de_texto;

import java.awt.Font;
public enum FontType {
    PLAIN("Plain", Font.PLAIN),
    BOLD("Bold", Font.BOLD),
    ITALIC("Italic", Font.ITALIC),
    BOLD_ITALIC("Bold Italic", Font.BOLD | Font.ITALIC);

    private final String displayName;
    private final int style;

    private FontType(String displayName, int style) {
        this.displayName = displayName;
        this.style = style;
    }
    public String getDisplayName() {
        return displayName;
    }
    public Font getFont(String fontName, int fontSize) {
        return new Font(fontName, style, fontSize);
    }
}
