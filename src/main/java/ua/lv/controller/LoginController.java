package ua.lv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.lv.service.ProductService;

/**
 * Created by User on 15.02.2020.
 */
@Controller
public class LoginController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/login")
    public String toLogin(){
        return "/login";
    }


}
