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
@Table (name = "mensaje")

public class Mensaje {
    //generacion de id autoincremental
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int mensajeId;

    private Date fechaDeEnvio;

    private String contenido;

    private String asunto;

    private int buzonId;

}
