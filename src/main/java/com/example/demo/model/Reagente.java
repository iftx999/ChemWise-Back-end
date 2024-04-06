package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
public class Reagente {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private String nomeReagente;

    @NotNull
    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private Integer qtdDisponivel;

    @NotNull
    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private String undMedida;
}
