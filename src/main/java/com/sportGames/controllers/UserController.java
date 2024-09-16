package com.sportGames.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domein.MyUser;
import service.UserService;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Assuming you have a Thymeleaf template named "login.html"
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Perform authentication logic using UserService
        MyUser user = userService.authenticate(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "redirect:/dashboard/" + user.getId();
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
