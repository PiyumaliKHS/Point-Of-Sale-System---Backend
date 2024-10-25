package com.demo.POS;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // One-to-one relationship with Item entity
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    @Column(nullable = false)
    private Integer quantity;

    @Column(name = "last_updated") // Custom column name in the database
    private LocalDateTime lastUpdated;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
