package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;

    private double price;
    @Column(name = "stock_quantity")
    private int quantity;
    private double weight;
    private int materialId;
    private int colorId;
    private String imageUrl;
    private String size;
    private String status;
}
