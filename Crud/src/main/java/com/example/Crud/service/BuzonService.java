package com.example.Crud.service;

import com.example.Crud.entity.Buzon;
import com.example.Crud.repository.BuzonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuzonService {
    @Autowired
    BuzonRepository personalRepository;

    public List<Buzon> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Buzon> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Buzon personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
