package com.aodev.virtualstore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String productName;
    private BigDecimal productValue;
    private String category;
    private String model;
    private String size;
    private String color;
}
