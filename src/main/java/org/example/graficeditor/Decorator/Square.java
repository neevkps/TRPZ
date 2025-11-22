package org.example.graficeditor.Decorator;

public class Square implements Graphic {
    @Override
    public String drawHtml() {
        return "<div class='shape square'>Square</div>";
    }
}
