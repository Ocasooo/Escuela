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

import com.example.Crud.entity.MaterialDidactico;
import com.example.Crud.service.MaterialDidacticoService;

@RestController
@RequestMapping(path = "api/v1/materialdidactico")
public class MaterialDidacticoController {
    @Autowired
    private MaterialDidacticoService materialdidacticoService;

    @GetMapping
    public List<MaterialDidactico> getAll()
    {
        return materialdidacticoService.getAllMaterialDidactico();
    }

    @GetMapping("/{materialdidacticoId}")
    public Optional<MaterialDidactico> getMaterialDidacticoById(@PathVariable("materialdidacticoId") int id){
        return materialdidacticoService.getMaterialDidacticoById(id);
    }

    @PostMapping
    public MaterialDidactico create(@RequestBody MaterialDidactico materialdidactico){
        materialdidacticoService.insertOrUpdateMaterialDidactico(materialdidactico);
        return materialdidactico;
    }

    @DeleteMapping("/{materialdidacticoId}")
    public void delete(@PathVariable("materialdidacticoId") int id){
        materialdidacticoService.deleteMaterialDidactico(id);
    }
}
