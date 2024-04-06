package com.example.demo.controller;


import com.example.demo.Service.ExperimentoService;
import com.example.demo.model.Experimento;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/experimento")
@CrossOrigin(origins = "http://localhost:4200/")
public class ExperimentoController {

    @Autowired
    private ExperimentoService experimentoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Experimento> find(@PathVariable Long id) {
        Experimento experimento = experimentoService.findById(id);
        return ResponseEntity.ok().body(experimento);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Experimento> save(@RequestBody  @Valid Experimento experimento){
       experimento = experimentoService.save(experimento);
        return ResponseEntity.ok().body(experimento);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Experimento> update(@PathVariable Long id, @RequestBody Experimento experimento){
        experimento.setId(id);
        experimento = experimentoService.update(experimento);
        return ResponseEntity.ok().body(experimento);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        experimentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //listar experimentos
    @GetMapping
    public ResponseEntity<List<Experimento>> findAll() {
        List<Experimento> experimentos = experimentoService.findAll();
        return ResponseEntity.ok().body(experimentos);
    }
}
