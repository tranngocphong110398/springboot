package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products/{id}")
    public String getProductsByCategoryId(@PathVariable("id") Long id, Model model){
        List<Product> products = productService.findProductsByCategoryId(id);
        model.addAttribute("products",products);
        return "list-products";
    }
}
