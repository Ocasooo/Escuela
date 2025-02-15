package com.example.Crud.service;

import com.example.Crud.entity.Clase;
import com.example.Crud.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaseService {
    @Autowired
    ClaseRepository claseRepository;

    public List<Clase> getAllClases(){
        return claseRepository.findAll();
    }

    public Optional<Clase> getClaseById(int id){
        return claseRepository.findById(id);
    }

    public void insertOrUpdateClase(Clase clase){
        claseRepository.save(clase);
    }

    public void deleteClase(int id){
        claseRepository.deleteById(id);
    }
}
