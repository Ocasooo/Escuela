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

import com.example.Crud.entity.MensajeForo;
import com.example.Crud.service.MensajeForoService;

@RestController
@RequestMapping(path = "api/v1/mensajeforo")
public class MensajeForoController {
    @Autowired
    private MensajeForoService mensajeforoService;

    @GetMapping
    public List<MensajeForo> getAll()
    {
        return mensajeforoService.getAllMensajeForo();
    }

    @GetMapping("/{mensajeforoId}")
    public Optional<MensajeForo> getMensajeForoById(@PathVariable("mensajeforoId") int id){
        return mensajeforoService.getMensajeForoById(id);
    }

    @PostMapping
    public MensajeForo create(@RequestBody MensajeForo mensajeforo){
        mensajeforoService.insertOrUpdateMensajeForo(mensajeforo);
        return mensajeforo;
    }

    @DeleteMapping("/{mensajeforoId}")
    public void delete(@PathVariable("mensajeforoId") int id){
        mensajeforoService.deleteMensajeForo(id);
    }
}
