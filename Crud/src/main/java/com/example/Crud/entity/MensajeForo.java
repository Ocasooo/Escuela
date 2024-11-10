package com.example.Crud.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "mensajeforo")

public class MensajeForo {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int mensajeId;

    private int foroId;

    private Date fechaDeEnvio;

    private String rutaArchivo;

    private String contenido;

    private String asunto;

    private int alumnoDni;

    private int profesorDni;

}
