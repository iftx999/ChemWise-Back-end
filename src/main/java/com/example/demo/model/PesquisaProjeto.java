package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
public class PesquisaProjeto {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private String nomeProjeto;

    @NotNull
    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private String descricao;


}
