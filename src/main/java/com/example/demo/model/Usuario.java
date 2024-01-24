package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Entity
@Data
public class Usuario {


    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @Column(length = 100, nullable = false)
    private String nome;

    @NotNull
    @Column(length = 100, nullable = false)
    private String email;

    @NotNull
    @Column(length = 100, nullable = false)
    private String senha;

}
