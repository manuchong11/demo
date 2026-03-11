package com.example.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Customer;

public interface customerRepository extends JpaRepository<Customer, Long> {

}
