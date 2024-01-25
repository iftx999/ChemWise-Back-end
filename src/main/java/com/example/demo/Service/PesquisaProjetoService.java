package com.example.demo.Service;


import com.example.demo.model.PesquisaProjeto;
import com.example.demo.repository.PesquisaProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PesquisaProjetoService {

    @Autowired
    public PesquisaProjetoRepository pesquisaProjetoRepository ;


        
  public List<PesquisaProjeto> findAll(){
        return pesquisaProjetoRepository.findAll(Sort.by("pesquisaProjeto").
                ascending());
    }

    public PesquisaProjeto findById(Long id){
        return pesquisaProjetoRepository.findById(id).get();
    }

    public PesquisaProjeto save(PesquisaProjeto pesquisaProjeto){
        return pesquisaProjetoRepository.save(pesquisaProjeto);
    }

    public void deleteById(Long id){
        pesquisaProjetoRepository.deleteById(id);
    }

    //deleteById
    public void delete(PesquisaProjeto pesquisaProjeto){
        pesquisaProjetoRepository.delete(pesquisaProjeto);
    }


    public PesquisaProjeto update(PesquisaProjeto pesquisaProjeto){
       return  pesquisaProjetoRepository.save(pesquisaProjeto);
    }
 }
