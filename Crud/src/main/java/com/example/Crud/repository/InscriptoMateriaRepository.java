package com.example.Crud.repository;

import com.example.Crud.entity.InscriptoMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptoMateriaRepository extends JpaRepository<InscriptoMateria, Integer> {
}