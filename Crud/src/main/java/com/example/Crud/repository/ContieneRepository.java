package com.example.Crud.repository;

import com.example.Crud.entity.Contiene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContieneRepository extends JpaRepository<Contiene, Integer> {
}