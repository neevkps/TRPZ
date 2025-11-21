package proxyTest;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ProxyImage_test implements Image_test {

    private final String filename;
    private RealImage_test realImage;

    private static final String FULL_DIR = "C:\\GraficEditor\\src\\main\\resources\\static\\full";
    private static final String PREVIEW_DIR = "C:\\GraficEditor\\src\\main\\resources\\static\\preview";
    private static final int THUMB_WIDTH = 120;
    private static final int THUMB_HEIGHT = 120;

    public ProxyImage_test(String filename) {
        this.filename = filename;
        generatePreviewIfNeeded();
    }

    private void generatePreviewIfNeeded() {
        try {
            File previewFile = new File(PREVIEW_DIR + filename);
            if (!previewFile.exists()) {
                File fullFile = new File(FULL_DIR + filename);
                if (!fullFile.exists()) return;

                // Створюємо папку preview, якщо її немає
                File dir = new File(PREVIEW_DIR);
                if (!dir.exists()) dir.mkdirs();

                BufferedImage original = ImageIO.read(fullFile);

                int newWidth = THUMB_WIDTH;
                int newHeight = (int) ((double) original.getHeight() / original.getWidth() * THUMB_WIDTH);
                if (newHeight > THUMB_HEIGHT) {
                    newHeight = THUMB_HEIGHT;
                    newWidth = (int) ((double) original.getWidth() / original.getHeight() * THUMB_HEIGHT);
                }

                Image tmp = original.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
                BufferedImage resized = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = resized.createGraphics();
                g2d.drawImage(tmp, 0, 0, null);
                g2d.dispose();

                // Автоматично визначаємо розширення
                String ext = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase();
                ImageIO.write(resized, ext, previewFile);

                System.out.println(">>> Створено прев’ю для: " + filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return filename;
    }

    @Override
    public String getPreviewUrl() {
        return "/preview/" + filename;
    }

    @Override
    public String getFullUrl() {
        if (realImage == null) {
            realImage = new RealImage_test(filename); // лениве завантаження
        }
        return realImage.getFullUrl();
    }
}