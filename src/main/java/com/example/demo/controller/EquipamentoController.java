package com.example.demo.controller;


import com.example.demo.Service.EquipamentoService;
import com.example.demo.model.Equipamento;
import com.example.demo.model.Experimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipamento")
public class EquipamentoController {

    @Autowired
    private EquipamentoService equipamentoService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<Equipamento> find(@PathVariable Long id) {
        Equipamento equipamento = equipamentoService.findById(id);
        return ResponseEntity.ok().body(equipamento);
    }
}
