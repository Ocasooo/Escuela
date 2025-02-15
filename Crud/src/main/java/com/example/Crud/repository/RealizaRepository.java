package com.example.Crud.repository;

import com.example.Crud.entity.Realiza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealizaRepository extends JpaRepository<Realiza, Integer> {
}