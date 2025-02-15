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

import com.example.Crud.entity.Imparte;
import com.example.Crud.service.ImparteService;

@RestController
@RequestMapping(path = "api/v1/imparte")
public class ImparteController {
    @Autowired
    private ImparteService imparteService;

    @GetMapping
    public List<Imparte> getAll()
    {
        return imparteService.getAllImparte();
    }

    @GetMapping("/{imparteId}")
    public Optional<Imparte> getImparteById(@PathVariable("imparteId") int id){
        return imparteService.getImparteById(id);
    }

    @PostMapping
    public Imparte create(@RequestBody Imparte imparte){
        imparteService.insertOrUpdateImparte(imparte);
        return imparte;
    }

    @DeleteMapping("/{imparteId}")
    public void delete(@PathVariable("imparteId") int id){
        imparteService.deleteImparte(id);
    }
}
