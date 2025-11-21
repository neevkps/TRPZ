package org.example.graficeditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proxy.Image;
import proxy.ImageProxy;

@SpringBootApplication
public class GraficEditorApplication {

	public static void main(String[] args) {
		System.out.println("--- Запуск Редактора ---");
		// Створюємо Проксі. Справжнє зображення ще не завантажено!
		Image image1 = new ImageProxy("Photo_A_4K.jpg");
		Image image2 = new ImageProxy("Vector_Icon.svg");
		System.out.println("Редактор готовий, чекає на дію користувача.");

		System.out.println("\n--- Користувач клікає на Photo_A_4K.jpg ---");
		// Лише зараз викликається display(), і Проксі завантажує реальний об'єкт
		image1.display();

		System.out.println("\n--- Користувач клікає на Vector_Icon.svg ---");
		image2.display();

		System.out.println("\n--- Користувач знову клікає на Photo_A_4K.jpg ---");
		// Реальний об'єкт вже завантажено, тому Проксі одразу делегує виклик
		image1.display();
		/*SpringApplication.run(GraficEditorApplication.class, args);*/
	}
}
