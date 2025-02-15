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

import com.example.Crud.entity.InscriptoMateria;
import com.example.Crud.service.InscriptoMateriaService;

@RestController
@RequestMapping(path = "api/v1/inscriptomateria")
public class InscriptoMateriaController {
    @Autowired
    private InscriptoMateriaService inscriptomateriaService;

    @GetMapping
    public List<InscriptoMateria> getAll()
    {
        return inscriptomateriaService.getAllInscriptoMateria();
    }

    @GetMapping("/{inscriptomateriaId}")
    public Optional<InscriptoMateria> getInscriptoMateriaById(@PathVariable("inscriptomateriaId") int id){
        return inscriptomateriaService.getInscriptoMateriaById(id);
    }

    @PostMapping
    public InscriptoMateria create(@RequestBody InscriptoMateria inscriptomateria){
        inscriptomateriaService.insertOrUpdateInscriptoMateria(inscriptomateria);
        return inscriptomateria;
    }

    @DeleteMapping("/{inscriptomateriaId}")
    public void delete(@PathVariable("inscriptomateriaId") int id){
        inscriptomateriaService.deleteInscriptoMateria(id);
    }
}
