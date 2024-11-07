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
    InscriptoRepository personalRepository;

    public List<Inscripto> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Inscripto> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Inscripto personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
