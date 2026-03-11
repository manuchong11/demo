package com.example.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.CartItem;

public interface cartItemRepository extends JpaRepository<CartItem, Long> {

}
