package com.example.project_1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product", nullable = false)
    public String name;
    public Integer price;
    public String description;

    public Product(String name, Integer price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

}
