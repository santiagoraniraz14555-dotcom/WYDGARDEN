package com.proyecto.conexion.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_pqrs")
public class TipoPqrs {

    @Id
    private int id_tipo_pqrs;

    @Column(length = 50)
    private String nombre_pqrs;

    // Getters y Setters

    public int getId_tipo_pqrs() {
        return id_tipo_pqrs;
    }

    public void setId_tipo_pqrs(int id_tipo_pqrs) {
        this.id_tipo_pqrs = id_tipo_pqrs;
    }

    public String getNombre_pqrs() {
        return nombre_pqrs;
    }

    public void setNombre_pqrs(String nombre_pqrs) {
        this.nombre_pqrs = nombre_pqrs;
    }
}
