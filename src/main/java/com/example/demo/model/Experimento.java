package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity
@Data
public class Experimento {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    


    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private String titulo;

    @Length(max = 16)
    @Column(length = 100, nullable = false)
    private String descricao;

    private Date data_cadas;

}
