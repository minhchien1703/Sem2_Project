package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "url")
    private String url;
    private String type;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "public_id")
    private String publicId;
}
