package com.example.Crud.controller;

import com.example.Crud.entity.MensajeForo;
import com.example.Crud.service.MensajeForoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personal")
public class MensajeForoController {
    @Autowired
    private MensajeForoService personalService;

    @GetMapping
    public List<MensajeForo> getAll()
    {
        return personalService.getAllPersonal();
    }

    @GetMapping("/{personalId}")
    public Optional<MensajeForo> getPersonalById(@PathVariable("personalId") int id){
        return personalService.getPersonalById(id);
    }

    @PostMapping
    public MensajeForo create(@RequestBody MensajeForo personal){
        personalService.insertOrUpdatePersonal(personal);
        return personal;
    }

    @DeleteMapping("/{personalId}")
    public void delete(@PathVariable("personalId") int id){
        personalService.deletePersonal(id);
    }
}
