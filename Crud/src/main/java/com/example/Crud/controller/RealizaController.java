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

import com.example.Crud.entity.Realiza;
import com.example.Crud.service.RealizaService;

@RestController
@RequestMapping(path = "api/v1/realiza")
public class RealizaController {
    @Autowired
    private RealizaService realizaService;

    @GetMapping
    public List<Realiza> getAll()
    {
        return realizaService.getAllRealiza();
    }

    @GetMapping("/{realizaId}")
    public Optional<Realiza> getRealizaById(@PathVariable("realizaId") int id){
        return realizaService.getRealizaById(id);
    }

    @PostMapping
    public Realiza create(@RequestBody Realiza realiza){
        realizaService.insertOrUpdateRealiza(realiza);
        return realiza;
    }

    @DeleteMapping("/{realizaId}")
    public void delete(@PathVariable("realizaId") int id){
        realizaService.deleteRealiza(id);
    }
}
