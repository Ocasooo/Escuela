package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "plandeestudio")

public class PlanEstudio {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int planDeEstudioId;

    private String nombre;

    private int duracion;

    private String gradoAcademico;

    private String descripcion;

}
