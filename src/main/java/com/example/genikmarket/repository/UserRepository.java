package com.example.genikmarket.repository;

import com.example.genikmarket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByLogin(String login);
    User findByLoginAndPassword(String login, String password);
}
