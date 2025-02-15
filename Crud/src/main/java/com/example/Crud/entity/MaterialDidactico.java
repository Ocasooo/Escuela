package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table (name = "materialdidactico")

public class MaterialDidactico {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int materialDidacticoId;

    private String tipo;

    private String rutaArchivo;

    private String observacion;

    private int calificacion;

    private int materialId;

    private int alumnoDni;

    private int profesorDni;

}
