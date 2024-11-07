package com.example.Crud.controller;

import com.example.Crud.entity.MaterialDidactico;
import com.example.Crud.service.MaterialDidacticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personal")
public class MaterialDidacticoController {
    @Autowired
    private MaterialDidacticoService personalService;

    @GetMapping
    public List<MaterialDidactico> getAll()
    {
        return personalService.getAllPersonal();
    }

    @GetMapping("/{personalId}")
    public Optional<MaterialDidactico> getPersonalById(@PathVariable("personalId") int id){
        return personalService.getPersonalById(id);
    }

    @PostMapping
    public MaterialDidactico create(@RequestBody MaterialDidactico personal){
        personalService.insertOrUpdatePersonal(personal);
        return personal;
    }

    @DeleteMapping("/{personalId}")
    public void delete(@PathVariable("personalId") int id){
        personalService.deletePersonal(id);
    }
}
