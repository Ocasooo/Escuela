package com.example.Crud.controller;

import com.example.Crud.entity.InscriptoMateria;
import com.example.Crud.service.InscriptoMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personal")
public class InscriptoMateriaController {
    @Autowired
    private InscriptoMateriaService personalService;

    @GetMapping
    public List<InscriptoMateria> getAll()
    {
        return personalService.getAllPersonal();
    }

    @GetMapping("/{personalId}")
    public Optional<InscriptoMateria> getPersonalById(@PathVariable("personalId") int id){
        return personalService.getPersonalById(id);
    }

    @PostMapping
    public InscriptoMateria create(@RequestBody InscriptoMateria personal){
        personalService.insertOrUpdatePersonal(personal);
        return personal;
    }

    @DeleteMapping("/{personalId}")
    public void delete(@PathVariable("personalId") int id){
        personalService.deletePersonal(id);
    }
}
