package com.example.Crud.service;

import com.example.Crud.entity.Realiza;
import com.example.Crud.repository.RealizaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RealizaService {
    @Autowired
    RealizaRepository personalRepository;

    public List<Realiza> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Realiza> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Realiza personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
