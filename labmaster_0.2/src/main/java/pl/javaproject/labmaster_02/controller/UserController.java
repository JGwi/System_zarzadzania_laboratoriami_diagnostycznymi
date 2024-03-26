package pl.javaproject.labmaster_02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.javaproject.labmaster_02.dto.UserDto;
import pl.javaproject.labmaster_02.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/rejestracja")
    public String getRegistrationPage(@ModelAttribute("user")UserDto userDto){
        return "Rejestracja";
    }

    @PostMapping("/rejestracja")
    public String saveUser(@ModelAttribute("user")UserDto userDto, Model model){
        userService.save(userDto);
        model.addAttribute ("message", "Rejestracja udana");
        return "Rejestracja";
    }

}
