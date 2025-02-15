package com.example.Crud.service;

import com.example.Crud.entity.Inscripto;
import com.example.Crud.repository.InscriptoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptoService {
    @Autowired
    InscriptoRepository inscriptoRepository;

    public List<Inscripto> getAllInscripto(){
        return inscriptoRepository.findAll();
    }

    public Optional<Inscripto> getInscriptoById(int id){
        return inscriptoRepository.findById(id);
    }

    public void insertOrUpdateInscripto(Inscripto inscripto){
        inscriptoRepository.save(inscripto);
    }

    public void deleteInscripto(int id){
        inscriptoRepository.deleteById(id);
    }
}
