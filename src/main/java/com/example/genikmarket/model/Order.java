package com.example.genikmarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private StatusOrder statusOrder;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOrder;
    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> products;
    @ManyToOne
    private User user;

}
