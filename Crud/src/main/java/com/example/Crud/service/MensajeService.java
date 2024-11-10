package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.Mensaje;
import com.example.Crud.repository.MensajeRepository;

@Service
public class MensajeService {
    @Autowired
    MensajeRepository mensajeRepository;

    public List<Mensaje> getAllMensaje(){
        return mensajeRepository.findAll();
    }

    public Optional<Mensaje> getMensajeById(int id){
        return mensajeRepository.findById(id);
    }

    public void insertOrUpdateMensaje(Mensaje mensaje){
        mensajeRepository.save(mensaje);
    }

    public void deleteMensaje(int id){
        mensajeRepository.deleteById(id);
    }
}
