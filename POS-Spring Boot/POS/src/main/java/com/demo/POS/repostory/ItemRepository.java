package com.pos.repository;

import com.pos.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ItemRepository extends JpaRepository<Item, Long> {
    // JpaRepository provides CRUD operations
}
