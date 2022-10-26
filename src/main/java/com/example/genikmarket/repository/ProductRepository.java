package com.example.genikmarket.repository;

import com.example.genikmarket.model.Product;
import com.example.genikmarket.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByName(String name);

    List<Product> findAllByCategory(ProductCategory category);
}
