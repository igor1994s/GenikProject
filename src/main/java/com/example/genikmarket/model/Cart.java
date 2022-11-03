package com.example.genikmarket.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Cart")
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue
    private long id;
    private long userId;

    @ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public Cart(long userId, Product product) {
        this.userId = userId;
        this.product = product;
    }
}
