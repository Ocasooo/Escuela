package com.example.Crud.service;

import com.example.Crud.entity.PlanEstudio;
import com.example.Crud.repository.PlanEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanEstudioService {
    @Autowired
    PlanEstudioRepository personalRepository;

    public List<PlanEstudio> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<PlanEstudio> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(PlanEstudio personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
