package com.example.genikmarket.service;

import com.example.genikmarket.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
    User findByLogin(String login);
    void save(User user);
}
