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

import com.example.Crud.entity.Contiene;
import com.example.Crud.service.ContieneService;

@RestController
@RequestMapping(path = "api/v1/contiene")
public class ContieneController {
    @Autowired
    private ContieneService contieneService;

    @GetMapping
    public List<Contiene> getAll()
    {
        return contieneService.getAllContiene();
    }

    @GetMapping("/{contieneId}")
    public Optional<Contiene> getContieneById(@PathVariable("contieneId") int id){
        return contieneService.getContieneById(id);
    }

    @PostMapping
    public Contiene create(@RequestBody Contiene contiene){
        contieneService.insertOrUpdateContiene(contiene);
        return contiene;
    }

    @DeleteMapping("/{contieneId}")
    public void delete(@PathVariable("contieneId") int id){
        contieneService.deleteContiene(id);
    }
}
