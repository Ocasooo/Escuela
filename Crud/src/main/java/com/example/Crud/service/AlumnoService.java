package com.example.Crud.service;

import com.example.Crud.entity.Alumno;
import com.example.Crud.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository personalRepository;

    public List<Alumno> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Alumno> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Alumno personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
