package com.example.Crud.controller;

import com.example.Crud.entity.Clase;
import com.example.Crud.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/clase")
public class ClaseController {
    @Autowired
    private ClaseService claseService;

    @GetMapping
    public List<Clase> getAll()
    {
        return claseService.getAllClases();
    }

    @GetMapping("{claseId}")
    public Optional<Clase> getClase(@PathVariable("claseId") int id){
        return claseService.getClaseById(id);
    }

    @PostMapping
    public Clase create(@RequestBody Clase clase){
        claseService.insertOrUpdateClase(clase);
        return clase;
    }

    @DeleteMapping("/{claseId}")
    public void delete(@PathVariable("claseId") int id){
        claseService.deleteClase(id);
    }
}
