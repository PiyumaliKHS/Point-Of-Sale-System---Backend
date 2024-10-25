package com.demo.POS;

import javax.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity 
public class Item {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates IDs
    private Long id;

    @Column(nullable = false) 

    @Column(nullable = false)
    private BigDecimal price; 

    private String description;

 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
