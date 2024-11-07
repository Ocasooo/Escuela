package com.example.Crud.repository;

import com.example.Crud.entity.Imparte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImparteRepository extends JpaRepository<Imparte, Integer> {
}