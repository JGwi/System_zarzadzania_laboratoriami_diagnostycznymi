package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.User;
import com.labmaster.labmaster_03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "admin/register";
    }

    @PostMapping("/admin/register")
    public String registerUser(@ModelAttribute User user) {
        userService.registerUser(user);
        return "redirect:/admin/register?success";
    }
}
