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
    InscriptoMateriaRepository inscriptomateriaRepository;

    public List<InscriptoMateria> getAllInscriptoMateria(){
        return inscriptomateriaRepository.findAll();
    }

    public Optional<InscriptoMateria> getInscriptoMateriaById(int id){
        return inscriptomateriaRepository.findById(id);
    }

    public void insertOrUpdateInscriptoMateria(InscriptoMateria inscriptomateri){
        inscriptomateriaRepository.save(inscriptomateri);
    }

    public void deleteInscriptoMateria(int id){
        inscriptomateriaRepository.deleteById(id);
    }
}
