package com.example.Crud.repository;

import com.example.Crud.entity.Inscripto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptoRepository extends JpaRepository<Inscripto, Integer> {
}