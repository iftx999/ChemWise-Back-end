package com.example.demo.controller;


import com.example.demo.Service.PesquisaProjetoService;
import com.example.demo.model.PesquisaProjeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pesquisaProjeto")
public class PesquisaProjetoController {

    @Autowired
    private PesquisaProjetoService pesquisaProjetoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PesquisaProjeto> find(Long id) {
        PesquisaProjeto pesquisaProjeto = pesquisaProjetoService.findById(id);
        return ResponseEntity.ok().body(pesquisaProjeto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PesquisaProjeto> update(Long id, PesquisaProjeto pesquisaProjeto){
        pesquisaProjeto.setId(id);
        pesquisaProjeto = pesquisaProjetoService.update(pesquisaProjeto);
        return ResponseEntity.ok().body(pesquisaProjeto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(Long id){
        pesquisaProjetoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
