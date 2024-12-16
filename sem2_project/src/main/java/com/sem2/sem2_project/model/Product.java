package com.sem2.sem2_project.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sem2.sem2_project.model.enums.ProductStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private Category category;
    private double price;
    @Column(name = "stock_quantity")
    private int quantity;
    private double weight;
    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    private double rating;
    private int sale;
    private String type;
    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;
    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;
    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Images> images = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "product_room",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id"))
    private Set<Room> rooms = new HashSet<>();
    @Column(name ="iscontinue")
    private boolean isContinue;
}
