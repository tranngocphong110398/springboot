package com.ecommerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = {"/","index"},method = RequestMethod.GET)
    public String homePage(){
        return "index";
    }

    @RequestMapping(value = {"/category"},method = RequestMethod.GET)
    public String categoreis(){
        return "category";
    }


}
