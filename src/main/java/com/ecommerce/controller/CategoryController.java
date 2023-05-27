package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

    @GetMapping(value = "categorylist/{id}")
    public ModelAndView Product(@PathVariable String id){
        ModelAndView mv = new ModelAndView("listcategory");
        mv.addObject("idCategory",id);
        return mv;
    }


}
