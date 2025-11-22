package org.example.graficeditor.Decorator;

public class Circle implements Graphic {
    @Override
    public String drawHtml() {
        return "<div class='shape circle'>Circle</div>";
    }
}
