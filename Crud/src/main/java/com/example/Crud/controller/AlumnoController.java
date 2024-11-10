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

import com.example.Crud.entity.Alumno;
import com.example.Crud.service.AlumnoService;

@RestController
@RequestMapping(path = "api/v1/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> getAll()
    {
        return alumnoService.getAllAlumno();
    }

    @GetMapping("/{alumnoId}")
    public Optional<Alumno> getAlumnoById(@PathVariable("alumnoId") int id){
        return alumnoService.getAlumnoById(id);
    }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno){
        alumnoService.insertOrUpdateAlumno(alumno);
        return alumno;
    }

    @DeleteMapping("/{alumnoId}")
    public void delete(@PathVariable("alumnoId") int id){
        alumnoService.deleteAlumno(id);
    }
}
