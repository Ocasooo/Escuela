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
    MateriaRepository materiaRepository;

    public List<Materia> getAllMateria(){
        return materiaRepository.findAll();
    }

    public Optional<Materia> getMateriaById(int id){
        return materiaRepository.findById(id);
    }

    public void insertOrUpdateMateria(Materia materia){
        materiaRepository.save(materia);
    }

    public void deleteMateria(int id){
        materiaRepository.deleteById(id);
    }
}
