package com.example.demo.repository;


import com.example.demo.model.Reagente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReagenteRepository extends JpaRepository<Reagente, Long> {
}
