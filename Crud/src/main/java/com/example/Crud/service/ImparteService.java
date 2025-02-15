package com.example.Crud.service;

import com.example.Crud.entity.Imparte;
import com.example.Crud.repository.ImparteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImparteService {
    @Autowired
    ImparteRepository imparteRepository;

    public List<Imparte> getAllImparte(){
        return imparteRepository.findAll();
    }

    public Optional<Imparte> getImparteById(int id){
        return imparteRepository.findById(id);
    }

    public void insertOrUpdateImparte(Imparte imparte){
        imparteRepository.save(imparte);
    }

    public void deleteImparte(int id){
        imparteRepository.deleteById(id);
    }
}
