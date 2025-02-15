package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "materia")

public class Materia {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int materiaId;

    private String nombreMateria;

}
