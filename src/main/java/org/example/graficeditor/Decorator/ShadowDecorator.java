package org.example.graficeditor.Decorator;

public class ShadowDecorator extends GraphicDecorator {
    public ShadowDecorator(Graphic graphic) { super(graphic); }

    @Override
    public String drawHtml() {
        return graphic.drawHtml().replace("'>", " shadow'>");
    }
}
