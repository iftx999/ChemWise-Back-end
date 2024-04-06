package com.example.demo.Service;


import com.example.demo.model.Equipamento;
import com.example.demo.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class EquipamentoService {

    @Autowired
    private EquipamentoRepository equipamentoRepository ;



    public Equipamento findById(Long id){
        return equipamentoRepository.findById(id).get();
    }

    public List<Equipamento> findAll() { return equipamentoRepository.findAll(Sort.by( "id"));
    }

    public Equipamento save(Equipamento equipamento){

        return equipamentoRepository.save(equipamento);
    }


    public Equipamento update(Equipamento equipamento){

        return equipamentoRepository.save(equipamento);
    }

    public void deleteById(Long id){
        equipamentoRepository.deleteById(id);
    }
}
