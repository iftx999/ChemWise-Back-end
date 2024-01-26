package com.example.demo.controller;


import com.example.demo.Service.ExperimentoService;
import com.example.demo.model.Experimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/experimento")
public class ExperimentoController {

    @Autowired
    private ExperimentoService experimentoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Experimento> find(@PathVariable Long id) {
        Experimento experimento = experimentoService.findById(id);
        return ResponseEntity.ok().body(experimento);
    }

    @PostMapping
    public ResponseEntity<Experimento> save(Experimento experimento){
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
}
