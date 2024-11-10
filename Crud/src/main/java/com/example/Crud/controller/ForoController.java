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

import com.example.Crud.entity.Foro;
import com.example.Crud.service.ForoService;

@RestController
@RequestMapping(path = "api/v1/foro")
public class ForoController {
    @Autowired
    private ForoService foroService;

    @GetMapping
    public List<Foro> getAll()
    {
        return foroService.getAllForo();
    }

    @GetMapping("/{foroId}")
    public Optional<Foro> getForoById(@PathVariable("foroId") int id){
        return foroService.getForoById(id);
    }

    @PostMapping
    public Foro create(@RequestBody Foro foro){
        foroService.insertOrUpdateForo(foro);
        return foro;
    }

    @DeleteMapping("/{foroId}")
    public void delete(@PathVariable("foroId") int id){
        foroService.deleteForo(id);
    }
}
