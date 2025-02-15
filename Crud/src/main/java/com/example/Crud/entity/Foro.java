package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "foro")

public class Foro {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int foroId;

    private int materilId;

    private String descripcion;

    private String titulo;

}
