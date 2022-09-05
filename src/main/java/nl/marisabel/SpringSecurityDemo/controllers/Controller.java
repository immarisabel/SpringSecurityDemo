package nl.marisabel.SpringSecurityDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/demo")
    public String demo() {
        return "Demo";
    }


}
