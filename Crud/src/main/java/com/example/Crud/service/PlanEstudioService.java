package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.PlanEstudio;
import com.example.Crud.repository.PlanEstudioRepository;

@Service
public class PlanEstudioService {
    @Autowired
    PlanEstudioRepository planestudioRepository;

    public List<PlanEstudio> getAllPlanEstudio(){
        return planestudioRepository.findAll();
    }

    public Optional<PlanEstudio> getPlanEstudioById(int id){
        return planestudioRepository.findById(id);
    }

    public void insertOrUpdatePlanEstudio(PlanEstudio plandeestudio){
        planestudioRepository.save(plandeestudio);
    }

    public void deletePlanEstudio(int id){
        planestudioRepository.deleteById(id);
    }
}
