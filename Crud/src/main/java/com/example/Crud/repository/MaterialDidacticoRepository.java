package com.example.Crud.repository;

import com.example.Crud.entity.MaterialDidactico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialDidacticoRepository extends JpaRepository<MaterialDidactico, Integer> {
}