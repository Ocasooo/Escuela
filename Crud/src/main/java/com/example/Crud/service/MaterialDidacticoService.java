package com.example.Crud.service;

import com.example.Crud.entity.MaterialDidactico;
import com.example.Crud.repository.MaterialDidacticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialDidacticoService {
    @Autowired
    MaterialDidacticoRepository personalRepository;

    public List<MaterialDidactico> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<MaterialDidactico> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(MaterialDidactico personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
