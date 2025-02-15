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
    MaterialDidacticoRepository materialdidacticoRepository;

    public List<MaterialDidactico> getAllMaterialDidactico(){
        return materialdidacticoRepository.findAll();
    }

    public Optional<MaterialDidactico> getMaterialDidacticoById(int id){
        return materialdidacticoRepository.findById(id);
    }

    public void insertOrUpdateMaterialDidactico(MaterialDidactico materialdidactico){
        materialdidacticoRepository.save(materialdidactico);
    }

    public void deleteMaterialDidactico(int id){
        materialdidacticoRepository.deleteById(id);
    }
}
