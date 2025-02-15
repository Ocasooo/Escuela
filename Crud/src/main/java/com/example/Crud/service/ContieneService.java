package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.Contiene;
import com.example.Crud.repository.ContieneRepository;

@Service
public class ContieneService {
    @Autowired
    ContieneRepository contieneRepository;

    public List<Contiene> getAllContiene(){
        return contieneRepository.findAll();
    }

    public Optional<Contiene> getContieneById(int id){
        return contieneRepository.findById(id);
    }

    public void insertOrUpdateContiene(Contiene contiene){
        contieneRepository.save(contiene);
    }

    public void deleteContiene(int id){
        contieneRepository.deleteById(id);
    }
}
