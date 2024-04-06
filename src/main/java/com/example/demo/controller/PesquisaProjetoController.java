package com.example.demo.controller;


import com.example.demo.Service.PesquisaProjetoService;
import com.example.demo.model.Equipamento;
import com.example.demo.model.PesquisaProjeto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/pesquisaProjeto")
@CrossOrigin(origins = "http://localhost:4200/")
public class PesquisaProjetoController {

    @Autowired
    private PesquisaProjetoService pesquisaProjetoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PesquisaProjeto> find( @PathVariable Long id) {
        PesquisaProjeto pesquisaProjeto = pesquisaProjetoService.findById(id);
        return ResponseEntity.ok().body(pesquisaProjeto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PesquisaProjeto> update(@PathVariable Long id, @RequestBody PesquisaProjeto pesquisaProjeto){
        pesquisaProjeto.setId(id);
        pesquisaProjeto = pesquisaProjetoService.update(pesquisaProjeto);
        return ResponseEntity.ok().body(pesquisaProjeto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(Long id){
        pesquisaProjetoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<PesquisaProjeto> save(@RequestBody  @Valid PesquisaProjeto pesquisaProjeto){
        pesquisaProjeto = pesquisaProjetoService.save(pesquisaProjeto);
        return ResponseEntity.ok().body(pesquisaProjeto);
    }
    //listar pesquisaProjeto
    //listar equipamentos
    @GetMapping
    public ResponseEntity<List<PesquisaProjeto>> findAll() {
        List<PesquisaProjeto> pesquisaProjetos = pesquisaProjetoService.findAll();
        return ResponseEntity.ok().body(pesquisaProjetos);
    }
}
