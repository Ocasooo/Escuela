package com.example.Crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crud.entity.PlanEstudio;
import com.example.Crud.service.PlanEstudioService;

@RestController
@RequestMapping(path = "api/v1/planestudio")
public class PlanEstudioController {
    @Autowired
    private PlanEstudioService planestudioService;

    @GetMapping
    public List<PlanEstudio> getAll()
    {
        return planestudioService.getAllPlanEstudio();
    }

    @GetMapping("/{planestudioId}")
    public Optional<PlanEstudio> getPlanEstudioById(@PathVariable("planestudioId") int id){
        return planestudioService.getPlanEstudioById(id);
    }

    @PostMapping
    public PlanEstudio create(@RequestBody PlanEstudio planestudio){
        planestudioService.insertOrUpdatePlanEstudio(planestudio);
        return planestudio;
    }

    @DeleteMapping("/{planestudioId}")
    public void delete(@PathVariable("planestudioId") int id){
        planestudioService.deletePlanEstudio(id);
    }
}
