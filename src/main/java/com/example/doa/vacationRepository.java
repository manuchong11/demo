package com.example.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Vacation;

public interface vacationRepository extends JpaRepository<Vacation, Long> {

}
