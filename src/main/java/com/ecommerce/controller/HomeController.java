package com.ecommerce.controller;


import com.ecommerce.service.CategoryService;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;


    @GetMapping(value = {"/","index"})
    public String homePage(Model model){
        model.addAttribute("categories",categoryService.findAllCategory());
        model.addAttribute("products",productService.findAllProducts());
        model.addAttribute("featured", categoryService.findByCategoryfeaturedProduct());
//        model.addAttribute("findProductBycategory",productService.findProductsByCategory());
        return "index";
    }

    @GetMapping(value = {"shop"})
    public String viewShopGrid(){
        return "listcategory";
    }

}
