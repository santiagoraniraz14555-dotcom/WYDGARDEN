package com.proyecto.conexion.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    private int id_rol;

    @Size(min = 2, max = 10)
    @Column(length = 10)
    private String Codigo;

    @Size(min = 3, max = 50)
    @Column(length = 50)
    private String Nombre;

    // Getters y setters
    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
