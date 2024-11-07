package com.example.Crud.service;

import com.example.Crud.entity.Examen;
import com.example.Crud.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenService {
    @Autowired
    ExamenRepository personalRepository;

    public List<Examen> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Examen> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Examen personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
