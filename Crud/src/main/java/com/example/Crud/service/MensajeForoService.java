package com.example.Crud.service;

import com.example.Crud.entity.MensajeForo;
import com.example.Crud.repository.MensajeForoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeForoService {
    @Autowired
    MensajeForoRepository personalRepository;

    public List<MensajeForo> getAllPersonal(){
        return personalRepository.findAll();
    }

    public Optional<MensajeForo> getPersonalById(int id){
        return personalRepository.findById(id);
    }

    public void insertOrUpdatePersonal(MensajeForo personal){
        personalRepository.save(personal);
    }

    public void deletePersonal(int id){
        personalRepository.deleteById(id);
    }
}
