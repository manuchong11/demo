package com.example.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Cart;

public interface cartRepository extends JpaRepository<Cart, Long> {

}
