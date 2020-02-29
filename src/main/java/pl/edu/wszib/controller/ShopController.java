package pl.edu.wszib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping
    public String welcome() {
        return "welcome";
    }
    @GetMapping("shipping")
    public String shipping() {
        return "shipping";
    }
}
