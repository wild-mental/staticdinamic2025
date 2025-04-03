package ac.su.kdt.staticdinamic2025.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping("/")
    public String root() {
        return "this is a root page";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}