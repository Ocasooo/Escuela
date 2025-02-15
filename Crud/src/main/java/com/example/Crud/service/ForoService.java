package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.Foro;
import com.example.Crud.repository.ForoRepository;

@Service
public class ForoService {
    @Autowired
    ForoRepository foroRepository;

    public List<Foro> getAllForo(){
        return foroRepository.findAll();
    }

    public Optional<Foro> getForoById(int id){
        return foroRepository.findById(id);
    }

    public void insertOrUpdateForo(Foro foro){
        foroRepository.save(foro);
    }

    public void deleteForo(int id){
        foroRepository.deleteById(id);
    }
}
