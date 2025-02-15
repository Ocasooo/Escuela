package com.example.Crud.repository;

import com.example.Crud.entity.PlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudio, Integer> {
}