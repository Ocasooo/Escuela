package com.example.Crud.controller;

import com.example.Crud.entity.PlanEstudio;
import com.example.Crud.service.PlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personal")
public class PlanEstudioController {
    @Autowired
    private PlanEstudioService personalService;

    @GetMapping
    public List<PlanEstudio> getAll()
    {
        return personalService.getAllPersonal();
    }

    @GetMapping("/{personalId}")
    public Optional<PlanEstudio> getPersonalById(@PathVariable("personalId") int id){
        return personalService.getPersonalById(id);
    }

    @PostMapping
    public PlanEstudio create(@RequestBody PlanEstudio personal){
        personalService.insertOrUpdatePersonal(personal);
        return personal;
    }

    @DeleteMapping("/{personalId}")
    public void delete(@PathVariable("personalId") int id){
        personalService.deletePersonal(id);
    }
}
