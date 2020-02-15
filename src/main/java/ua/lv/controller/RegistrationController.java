package ua.lv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.lv.entity.User;
import ua.lv.service.UserService;

/**
 * Created by User on 15.02.2020.
 */
@Controller
public class RegistrationController {

    @Autowired
    UserService userService;

    @GetMapping("/registration")
    String toRegistration(Model model){
        model.addAttribute("emptyUser", new User());
        return "/registration";

    }

    @RequestMapping (value = "saveUserSpringForm")
    String saveUser(@ModelAttribute("emptyUser")User user){
        userService.save(user);
        return "redirect:/login";
    }
}
