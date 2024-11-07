package com.example.Crud.service;

import com.example.Crud.entity.InscriptoMateria;
import com.example.Crud.repository.InscriptoMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptoMateriaService {
    @Autowired
    InscriptoMateriaRepository personalRepository;

    public List<InscriptoMateria> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<InscriptoMateria> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(InscriptoMateria personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
