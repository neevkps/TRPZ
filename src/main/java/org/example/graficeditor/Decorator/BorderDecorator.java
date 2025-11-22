package org.example.graficeditor.Decorator;

public class BorderDecorator extends GraphicDecorator {
    public BorderDecorator(Graphic graphic) { super(graphic); }

    @Override
    public String drawHtml() {
        return graphic.drawHtml().replace("'>", " border'>");
    }
}
