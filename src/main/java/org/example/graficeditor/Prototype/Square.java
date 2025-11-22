package org.example.graficeditor.Prototype;

import java.awt.*;

public class Square extends GraphicObject {

    private int size;

    public Square(int size, Color color) {
        super("Square", color);
        this.size = size;
    }

    @Override
    public void draw(Graphics g) {
        if (g != null) g.fillRect(x, y, size, size);
        System.out.println("Draw Square at (" + x + "," + y + "), size=" + size);
    }
}