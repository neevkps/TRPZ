package Prototype;
import java.awt.*;

public abstract class GraphicObject implements Cloneable {
    protected int x, y; // координати
    protected Color color;
    protected String name;

    public GraphicObject(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);

    @Override
    public GraphicObject clone() {
        try {
            return (GraphicObject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }
}
