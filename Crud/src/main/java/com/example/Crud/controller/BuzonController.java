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

import com.example.Crud.entity.Buzon;
import com.example.Crud.service.BuzonService;

@RestController
@RequestMapping(path = "api/v1/buzon")
public class BuzonController {
    @Autowired
    private BuzonService buzonService;

    @GetMapping
    public List<Buzon> getAll()
    {
        return buzonService.getAllBuzon();
    }

    @GetMapping("/{buzonId}")
    public Optional<Buzon> getBuzonById(@PathVariable("buzonId") int id){
        return buzonService.getBuzonById(id);
    }

    @PostMapping
    public Buzon create(@RequestBody Buzon buzon){
        buzonService.insertOrUpdateBuzon(buzon);
        return buzon;
    }

    @DeleteMapping("/{buzonId}")
    public void delete(@PathVariable("buzonId") int id){
        buzonService.deleteBuzon(id);
    }
}
