package com.example.Crud.service;

import com.example.Crud.entity.Imparte;
import com.example.Crud.repository.ImparteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImparteService {
    @Autowired
    ImparteRepository personalRepository;

    public List<Imparte> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Imparte> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Imparte personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
