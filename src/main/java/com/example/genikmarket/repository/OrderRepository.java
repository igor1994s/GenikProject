package com.example.genikmarket.repository;

import com.example.genikmarket.model.Order;
import com.example.genikmarket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
