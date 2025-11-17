package com.proyecto.conexion.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reportes")
public class Reportes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 255)
    private String nombre;

    @Column(length = 255)
    private String ruta;

    @Column(length = 255)
    private String tipo;

    private Long id_usuario;

    private java.sql.Timestamp created_at;

    private java.sql.Timestamp updated_at;

    // Getters y Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public java.sql.Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(java.sql.Timestamp created_at) {
        this.created_at = created_at;
    }

    public java.sql.Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(java.sql.Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
