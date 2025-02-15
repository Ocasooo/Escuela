package com.example.Crud.repository;

import com.example.Crud.entity.Buzon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuzonRepository extends JpaRepository<Buzon, Integer> {
}