package com.example.genikmarket.repository;

import com.example.genikmarket.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
