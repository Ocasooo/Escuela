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

import com.example.Crud.entity.Mensaje;
import com.example.Crud.service.MensajeService;

@RestController
@RequestMapping(path = "api/v1/mensaje")
public class MensajeController {
    @Autowired
    private MensajeService mensajeService;

    @GetMapping
    public List<Mensaje> getAll()
    {
        return mensajeService.getAllMensaje();
    }

    @GetMapping("/{mensajeId}")
    public Optional<Mensaje> getMensajeById(@PathVariable("mensajeId") int id){
        return mensajeService.getMensajeById(id);
    }

    @PostMapping
    public Mensaje create(@RequestBody Mensaje mensaje){
        mensajeService.insertOrUpdateMensaje(mensaje);
        return mensaje;
    }

    @DeleteMapping("/{mensajeId}")
    public void delete(@PathVariable("mensajeId") int id){
        mensajeService.deleteMensaje(id);
    }
}
