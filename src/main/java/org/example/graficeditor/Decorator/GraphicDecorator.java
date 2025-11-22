package org.example.graficeditor.Decorator;

public abstract class GraphicDecorator implements Graphic {
    protected Graphic graphic;

    public GraphicDecorator(Graphic graphic) {
        this.graphic = graphic;
    }
}
