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

import com.example.Crud.entity.Examen;
import com.example.Crud.service.ExamenService;

@RestController
@RequestMapping(path = "api/v1/examen")
public class ExamenController {
    @Autowired
    private ExamenService examenService;

    @GetMapping
    public List<Examen> getAll()
    {
        return examenService.getAllExamen();
    }

    @GetMapping("/{examenId}")
    public Optional<Examen> getExamenById(@PathVariable("examenId") int id){
        return examenService.getExamenById(id);
    }

    @PostMapping
    public Examen create(@RequestBody Examen examen){
        examenService.insertOrUpdateExamen(examen);
        return examen;
    }

    @DeleteMapping("/{examenId}")
    public void delete(@PathVariable("examenId") int id){
        examenService.deleteExamen(id);
    }
}
