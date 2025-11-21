package Controllers;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import proxyTest.Image_test;
import proxyTest.ProxyImage_test;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ImageController {

    private static final String FULL_DIR = "C:\\GraficEditor\\src\\main\\resources\\static\\full\\";
    private static final String PREVIEW_DIR = "C:\\GraficEditor\\src\\main\\resources\\static\\preview\\";

    @GetMapping("/")
    public String index(Model model) {
        List<Image_test> images = new ArrayList<>();
        File dir = new File(FULL_DIR);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isFile() &&
                        (f.getName().toLowerCase().endsWith(".jpg")
                                || f.getName().toLowerCase().endsWith(".jpeg")
                                || f.getName().toLowerCase().endsWith(".png"))) {
                    images.add(new ProxyImage_test(f.getName()));
                }
            }
        }

        System.out.println("Images found: " + images.size());
        images.forEach(img -> System.out.println(img.getName()));

        model.addAttribute("images", images);
        return "index";
    }

    @GetMapping("/full/{filename:.+}")
    @ResponseBody
    public Resource getFullImage(@PathVariable String filename) throws MalformedURLException {
        return new UrlResource(new File(FULL_DIR + filename).toURI());
    }

    @GetMapping("/preview/{filename:.+}")
    @ResponseBody
    public Resource getPreviewImage(@PathVariable String filename) throws MalformedURLException {
        File previewFile = new File(PREVIEW_DIR + filename);
        if (!previewFile.exists()) {
            new ProxyImage_test(filename); // створюємо прев’ю на льоту
        }
        return new UrlResource(previewFile.toURI());
    }
}
