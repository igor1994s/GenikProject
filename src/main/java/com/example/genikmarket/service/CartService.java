package com.example.genikmarket.service;

import com.example.genikmarket.model.Cart;
import com.example.genikmarket.model.Product;
import com.example.genikmarket.model.User;

public interface CartService {
    void addCart(Product product, User user);
}
