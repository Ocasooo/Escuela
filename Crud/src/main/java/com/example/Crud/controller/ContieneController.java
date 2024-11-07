package com.example.Crud.controller;

import com.example.Crud.entity.Contiene;
import com.example.Crud.service.ContieneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personal")
public class ContieneController {
    @Autowired
    private ContieneService personalService;

    @GetMapping
    public List<Contiene> getAll()
    {
        return personalService.getAllPersonal();
    }

    @GetMapping("/{personalId}")
    public Optional<Contiene> getPersonalById(@PathVariable("personalId") int id){
        return personalService.getPersonalById(id);
    }

    @PostMapping
    public Contiene create(@RequestBody Contiene personal){
        personalService.insertOrUpdatePersonal(personal);
        return personal;
    }

    @DeleteMapping("/{personalId}")
    public void delete(@PathVariable("personalId") int id){
        personalService.deletePersonal(id);
    }
}
