package com.example.demo.repository;


import com.example.demo.model.PesquisaProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesquisaProjetoRepository  extends JpaRepository<PesquisaProjeto, Long> {
}
