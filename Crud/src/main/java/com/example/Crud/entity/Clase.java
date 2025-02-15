package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "clase")

public class Clase {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int claseid;

    private String nombre;

    private String aula;

    private java.sql.Date fecha_hora;

}
