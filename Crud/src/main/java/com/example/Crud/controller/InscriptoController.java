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

import com.example.Crud.entity.Inscripto;
import com.example.Crud.service.InscriptoService;

@RestController
@RequestMapping(path = "api/v1/inscripto")
public class InscriptoController {
    @Autowired
    private InscriptoService inscriptoService;

    @GetMapping
    public List<Inscripto> getAll()
    {
        return inscriptoService.getAllInscripto();
    }

    @GetMapping("/{inscriptoId}")
    public Optional<Inscripto> getInscriptoById(@PathVariable("inscriptoId") int id){
        return inscriptoService.getInscriptoById(id);
    }

    @PostMapping
    public Inscripto create(@RequestBody Inscripto inscripto){
        inscriptoService.insertOrUpdateInscripto(inscripto);
        return inscripto;
    }

    @DeleteMapping("/{inscriptoId}")
    public void delete(@PathVariable("inscriptoId") int id){
        inscriptoService.deleteInscripto(id);
    }
}
