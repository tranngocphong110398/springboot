package com.ecommerce.repository;

import com.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Long> {

    @Query(value = "SELECT * FROM categories limit 5",nativeQuery = true)
    List<Category> findByCategoryfeaturedProduct();

    Category findCategoryById(Long id);



}
