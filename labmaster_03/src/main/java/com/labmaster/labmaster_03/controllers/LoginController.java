package com.labmaster.labmaster_03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    //@RequestMapping(value = "/login", method = RequestMethod.GET)
    @GetMapping(value = "/login")
    public String Login(){
        return "login";
    }
}
