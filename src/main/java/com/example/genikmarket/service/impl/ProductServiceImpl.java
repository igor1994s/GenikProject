package com.example.genikmarket.service.impl;

import com.example.genikmarket.model.Product;
import com.example.genikmarket.model.ProductCategory;
import com.example.genikmarket.repository.ProductRepository;
import com.example.genikmarket.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllByCategory(ProductCategory category) {
        return productRepository.findAllByCategory(category);
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).orElse(new Product());
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
