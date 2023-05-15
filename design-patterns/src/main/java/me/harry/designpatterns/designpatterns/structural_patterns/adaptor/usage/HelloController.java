package me.harry.designpatterns.designpatterns.structural_patterns.adaptor.usage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hi";
    }
}
