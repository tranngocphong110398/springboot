package com.ecommerce.service;

import com.ecommerce.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> findAllCategory();
    List<Category> findByCategoryfeaturedProduct();

    Category findCategoryById(Long id);
}
