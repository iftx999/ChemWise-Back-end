package com.example.demo.Service;

import com.example.demo.model.Reagente;
import com.example.demo.repository.ReagenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReagenteService {

    @Autowired
    private ReagenteRepository reagenteRepository ;
    public List<Reagente> findAll() {
        return reagenteRepository.findAll(Sort.by("reagente").
                ascending());
    }

    public Reagente findById(Long id) {
        return reagenteRepository.findById(id).get();
    }

    public Reagente save(Reagente reagente) {
        return reagenteRepository.save(reagente);
    }

    public Reagente update(Reagente reagente) {
        return reagenteRepository.save(reagente);
    }

    public void deleteById(Long id) {
        reagenteRepository.deleteById(id);
    }

    public void delete(Reagente reagente) {
        reagenteRepository.delete(reagente);
    }
}
