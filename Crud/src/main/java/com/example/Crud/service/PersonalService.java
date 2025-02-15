package com.example.Crud.service;

import com.example.Crud.entity.Personal;
import com.example.Crud.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalService {
    @Autowired
    PersonalRepository personalRepository;

    public List<Personal> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Personal> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Personal personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
