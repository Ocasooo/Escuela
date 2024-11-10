package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.Alumno;
import com.example.Crud.repository.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public List<Alumno> getAllAlumno(){
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> getAlumnoById(int id){
        return alumnoRepository.findById(id);
    }

    public void insertOrUpdateAlumno(Alumno alumno){
        alumnoRepository.save(alumno);
    }

    public void deleteAlumno(int id){
        alumnoRepository.deleteById(id);
    }
}
