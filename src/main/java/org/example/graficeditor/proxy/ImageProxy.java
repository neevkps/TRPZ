package org.example.graficeditor.proxy;

public class ImageProxy implements Image {
    private RealImage realImage; // Посилання на реальний об'єкт
    private String fileName;

    // При створенні Проксі, реальне зображення ще НЕ завантажується
    public ImageProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("Створення Проксі для зображення " + fileName);
    }

    @Override
    public void display() {
        // ЛІНИВЕ ЗАВАНТАЖЕННЯ
        if (realImage == null) {
            System.out.println("Проксі: Створення та завантаження реального об'єкта...");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}