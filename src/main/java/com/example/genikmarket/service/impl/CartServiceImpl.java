package com.example.genikmarket.service.impl;

import com.example.genikmarket.model.Cart;
import com.example.genikmarket.model.Product;
import com.example.genikmarket.model.User;
import com.example.genikmarket.repository.CartRepository;
import com.example.genikmarket.service.CartService;

public class CartServiceImpl implements CartService {

    public final CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public void addCart(Product product, User user) {
        cartRepository.save(new Cart(user.getId(), product));
    }
}
