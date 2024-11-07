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
    private int dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String contraseña;

    private String sexo;

    private Date fechaDeNacimiento;

    private int horas;

    private String especialidad;

    private int EsAdministrativo;

}
