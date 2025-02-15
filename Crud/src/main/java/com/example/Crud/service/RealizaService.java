package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.Realiza;
import com.example.Crud.repository.RealizaRepository;

@Service
public class RealizaService {
    @Autowired
    RealizaRepository realizaRepository;

    public List<Realiza> getAllRealiza(){
        return realizaRepository.findAll();
    }

    public Optional<Realiza> getRealizaById(int id){
        return realizaRepository.findById(id);
    }

    public void insertOrUpdateRealiza(Realiza realiza){
        realizaRepository.save(realiza);
    }

    public void deleteRealiza(int id){
        realizaRepository.deleteById(id);
    }
}
