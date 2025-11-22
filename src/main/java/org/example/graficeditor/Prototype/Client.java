package org.example.graficeditor.Prototype;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {public static void main(String[] args) {
    ToolPanel panel = new ToolPanel();

    // додаємо прототипи для панелі
    panel.addPrototype("Circle", new Circle(40, Color.RED));
    panel.addPrototype("Square", new Square(50, Color.BLUE));

    // список об’єктів на полотні редактора
    List<GraphicObject> canvas = new ArrayList<>();

    // імітуємо натискання кнопок
    canvas.add(panel.clickButton("Circle", 10, 10));
    canvas.add(panel.clickButton("Square", 100, 50));
    canvas.add(panel.clickButton("Circle", 200, 150));

    // малюємо об’єкти (можна в GUI, зараз просто в консолі)
    for (GraphicObject obj : canvas) {
        obj.draw(null);
    }
}
}