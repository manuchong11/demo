package com.example.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Country;

public interface countryRepository extends JpaRepository<Country, Long> {

}
