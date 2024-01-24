package com.example.demo.repository;


import com.example.demo.model.Experimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperimentoRepository extends JpaRepository<Experimento, Long> {
}
