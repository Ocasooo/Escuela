package com.example.Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.entity.MensajeForo;
import com.example.Crud.repository.MensajeForoRepository;

@Service
public class MensajeForoService {
    @Autowired
    MensajeForoRepository mensajeforoRepository;

    public List<MensajeForo> getAllMensajeForo(){
        return mensajeforoRepository.findAll();
    }

    public Optional<MensajeForo> getMensajeForoById(int id){
        return mensajeforoRepository.findById(id);
    }

    public void insertOrUpdateMensajeForo(MensajeForo mensajeforo){
        mensajeforoRepository.save(mensajeforo);
    }

    public void deleteMensajeForo(int id){
        mensajeforoRepository.deleteById(id);
    }
}
