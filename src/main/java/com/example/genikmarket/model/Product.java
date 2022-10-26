package com.example.genikmarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private ProductCategory category;
    private String image;
    private int price;
    private String description;
    @OneToMany
    @JoinColumn(name="review_id")
    private List<Review> review;

}
