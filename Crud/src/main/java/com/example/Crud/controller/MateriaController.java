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

import com.example.Crud.entity.Materia;
import com.example.Crud.service.MateriaService;

@RestController
@RequestMapping(path = "api/v1/materia")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getAll()
    {
        return materiaService.getAllMateria();
    }

    @GetMapping("/{materiaId}")
    public Optional<Materia> getMateriaById(@PathVariable("materiaId") int id){
        return materiaService.getMateriaById(id);
    }

    @PostMapping
    public Materia create(@RequestBody Materia materia){
        materiaService.insertOrUpdateMateria(materia);
        return materia;
    }

    @DeleteMapping("/{materiaId}")
    public void delete(@PathVariable("materiaId") int id){
        materiaService.deleteMateria(id);
    }
}
