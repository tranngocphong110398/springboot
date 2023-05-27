package com.ecommerce.service;

import com.ecommerce.model.Category;
import com.ecommerce.model.Product;

import java.util.List;

public interface ProductService {


    List<Product> findAllProducts();

    List<Product> findProductsByCategoryId(Long id);
}
