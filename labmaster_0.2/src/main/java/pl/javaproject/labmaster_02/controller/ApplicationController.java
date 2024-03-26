package pl.javaproject.labmaster_02.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class ApplicationController {

    @GetMapping("/testAPI")
    public String testMethod() {
        return "Działam poprawnie ";
    }

}

