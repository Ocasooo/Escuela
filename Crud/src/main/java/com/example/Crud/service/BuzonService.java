package com.example.Crud.service;

import com.example.Crud.entity.Buzon;
import com.example.Crud.repository.BuzonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuzonService {
    @Autowired
    BuzonRepository BuzonRepository;

    public List<Buzon> getAllBuzon(){
        return BuzonRepository.findAll();
    }

    public Optional<Buzon> getBuzonById(int id){
        return BuzonRepository.findById(id);
    }

    public void insertOrUpdateBuzon(Buzon Buzon){
        BuzonRepository.save(Buzon);
    }

    public void deleteBuzon(int id){
        BuzonRepository.deleteById(id);
    }
}
