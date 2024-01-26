package com.example.demo.Service;


import com.example.demo.model.Experimento;
import com.example.demo.repository.ExperimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperimentoService {

    @Autowired
    private ExperimentoRepository experimentoRepository ;


    public Experimento findById(Long id){
        return experimentoRepository.findById(id).get();
    }
    public List<Experimento> findAll(){
        return experimentoRepository.findAll(Sort.by("experimento").
                ascending());
    }

   public Experimento save(Experimento experimento){
       return experimentoRepository.save(experimento);
    }

    public Experimento update(Experimento experimento){
      return  experimentoRepository.save(experimento);
    }
    public void deleteById(Long id){
        experimentoRepository.deleteById(id);
    }

}
