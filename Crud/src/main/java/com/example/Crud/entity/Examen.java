package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "examen")

public class Examen {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int examenId;

    private String rutaExamen;

    private String descripcion;

    private int calificacion;

    private int personalDni;

    private int alumnoDni;

}
