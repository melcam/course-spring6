package com.melcam.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.melcam.springbootweb.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Juan", "Roman");
        user.setEmail("juan@email.com");
        model.addAttribute("title", "Hola detail en Spring boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
           // model.addAttribute("users", users);
        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("Juan", "Roman"),
                new User("Ricardo", "Rojas", "ricardo@gmail.com"),
                new User("Francisco", "Lopez")
        );
    }

}
