package com.example.genikmarket.service;

import com.example.genikmarket.model.Product;
import com.example.genikmarket.model.ProductCategory;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    List<Product> findAllByCategory(ProductCategory category);

    Product findById(long id);

    Product findByName(String name);

    Product update(Product product);

    Product save(Product product);

    void delete(Product product);
}
