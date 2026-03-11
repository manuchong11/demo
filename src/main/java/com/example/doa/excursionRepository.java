package com.example.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Excursion;

public interface excursionRepository extends JpaRepository<Excursion, Long> {

}
