package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "inscriptomateria")

public class InscriptoMateria {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int alumnoDni;

    private int materialId;

    private int calificacion;

}
