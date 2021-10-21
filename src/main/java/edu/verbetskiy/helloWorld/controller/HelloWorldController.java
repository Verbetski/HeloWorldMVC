package edu.verbetskiy.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping()
    public String helloPage(Model model) {
        model.addAttribute("message", "Hello World!!!");
        return "StartHelloPage";
    }
}
