package ac.su.kdt.staticdinamic2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
    @RequestMapping("/index")
    public String index() {
        return "/index.html";
    }
}