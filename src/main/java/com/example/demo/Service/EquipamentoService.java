package com.example.demo.Service;


import com.example.demo.model.Equipamento;
import com.example.demo.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository ;

    public List<Equipamento> findAll(){
        return equipamentoRepository.findAll(Sort.by("equipamento"));
    }


    public void save(Equipamento equipamento){
        equipamentoRepository.save(equipamento);
    }


    public void update(Equipamento equipamento){
        equipamentoRepository.save(equipamento);
    }
}
