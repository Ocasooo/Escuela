package com.example.Crud.service;

import com.example.Crud.entity.Contiene;
import com.example.Crud.repository.ContieneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContieneService {
    @Autowired
    ContieneRepository personalRepository;

    public List<Contiene> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Contiene> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Contiene personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
