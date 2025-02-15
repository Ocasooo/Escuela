package com.example.Crud.controller;

import com.example.Crud.entity.Personal;
import com.example.Crud.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personal")
public class PersonalController {
    @Autowired
    private PersonalService personalService;

    @GetMapping
    public List<Personal> getAll()
    {
        return personalService.getAllPersonal();
    }

    @GetMapping("/{personalId}")
    public Optional<Personal> getPersonalById(@PathVariable("personalId") int id){
        return personalService.getPersonalById(id);
    }

    @PostMapping
    public Personal create(@RequestBody Personal personal){
        personalService.insertOrUpdatePersonal(personal);
        return personal;
    }

    @DeleteMapping("/{personalId}")
    public void delete(@PathVariable("personalId") int id){
        personalService.deletePersonal(id);
    }
}
