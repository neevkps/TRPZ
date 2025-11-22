package org.example.graficeditor.Controllers;

import org.example.graficeditor.Decorator.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GraphicController {

    private final List<Graphic> graphics = new ArrayList<>();

    @GetMapping({"/", "/decorator"})
    public String index(Model model,
                        @RequestParam(required = false) String shape,
                        @RequestParam(required = false) String decorator) {
        if (shape != null) {
            Graphic g;
            if ("circle".equals(shape)) g = new Circle();
            else g = new Square();

            if ("border".equals(decorator)) g = new BorderDecorator(g);
            if ("shadow".equals(decorator)) g = new ShadowDecorator(g);
            if ("both".equals(decorator)) g = new BorderDecorator(new ShadowDecorator(g));

            graphics.add(g);
        }

        model.addAttribute("graphics", graphics);
        return "index";
    }

}