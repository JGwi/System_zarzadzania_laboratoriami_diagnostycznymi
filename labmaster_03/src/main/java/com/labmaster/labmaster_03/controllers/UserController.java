package com.labmaster.labmaster_03.controllers;

import com.labmaster.labmaster_03.entities.User;
import com.labmaster.labmaster_03.entities.Visit;
import com.labmaster.labmaster_03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping({"","/"})
    public String viewUserPage(Model model) {
        model.addAttribute("listUser", userService.getAllUsers());
        return "users/user";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute("user", new User());
        return "users/register";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.registerUser(user);
        return "redirect:/admin/user";
    }

    @GetMapping("/edit/{id}")
    public String showFromForUpdate(@PathVariable(value = "id")Long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "users/updare_user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value = "id")Long id){
        this.userService.deleteUserById(id);
        return "redirect:/admin/user";
    }
}
