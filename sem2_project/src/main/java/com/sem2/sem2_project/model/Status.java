package com.sem2.sem2_project.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "status")
public class Status {
    @Id
    private int id;
    private String status;
}
