package com.example.demo.controller;


import com.example.demo.Service.EquipamentoService;
import com.example.demo.model.Equipamento;
import com.example.demo.model.Experimento;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/equipamentos")
@CrossOrigin(origins = "http://localhost:4200/")
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<Equipamento> find(@PathVariable Long id) {
        Equipamento equipamento = equipamentoService.findById(id);
        return ResponseEntity.ok().body(equipamento);
    }
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Equipamento> save(@RequestBody  @Valid Equipamento equipamento){
        equipamento = equipamentoService.save(equipamento);
        return ResponseEntity.ok().body(equipamento);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Equipamento> update(@PathVariable Long id, @RequestBody Equipamento equipamento){
        equipamento.setId(id);
        equipamento = equipamentoService.update(equipamento);
        return ResponseEntity.ok().body(equipamento);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        equipamentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

 //listar equipamentos
    @GetMapping
    public ResponseEntity<List<Equipamento>> findAll() {
        List<Equipamento> equipamentos = equipamentoService.findAll();
        return ResponseEntity.ok().body(equipamentos);
    }
}
