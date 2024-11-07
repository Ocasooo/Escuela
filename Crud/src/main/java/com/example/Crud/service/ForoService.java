package com.example.Crud.service;

import com.example.Crud.entity.Foro;
import com.example.Crud.repository.ForoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForoService {
    @Autowired
    ForoRepository personalRepository;

    public List<Foro> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<Foro> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(Foro personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
