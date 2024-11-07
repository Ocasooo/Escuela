package com.example.Crud.service;

import com.example.Crud.entity.Materia;
import com.example.Crud.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository personalRepository;

    public List<Materia> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Materia> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Materia personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
