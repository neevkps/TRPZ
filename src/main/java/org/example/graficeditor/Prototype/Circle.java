package org.example.graficeditor.Prototype;

import java.awt.*;

public class Circle extends GraphicObject {

    private int radius;

    public Circle(int radius, Color color) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        if (g != null) g.fillOval(x, y, radius*2, radius*2);
        System.out.println("Draw Circle at (" + x + "," + y + "), radius=" + radius);
    }
}
