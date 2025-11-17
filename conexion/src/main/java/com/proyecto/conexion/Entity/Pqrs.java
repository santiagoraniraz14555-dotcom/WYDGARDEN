package com.proyecto.conexion.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pqrs")
public class Pqrs {

    @Id
    private int id_pqrs;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pqrs")
    private TipoPqrs tipo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private java.sql.Date Fecha_pqrs;

    @Column(length = 100)
    private String Asunto;

    @Column(columnDefinition = "text")
    private String descripcion;

    @Column(columnDefinition = "text")
    private String respuesta_pqrs;

    // ───────────────────────────────────────────────
    //                 Getters y Setters
    // ───────────────────────────────────────────────

    public int getId_pqrs() {
        return id_pqrs;
    }

    public void setId_pqrs(int id_pqrs) {
        this.id_pqrs = id_pqrs;
    }

    public TipoPqrs getTipo() {
        return tipo;
    }

    public void setTipo(TipoPqrs tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public java.sql.Date getFecha_pqrs() {
        return Fecha_pqrs;
    }

    public void setFecha_pqrs(java.sql.Date fecha_pqrs) {
        Fecha_pqrs = fecha_pqrs;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String asunto) {
        Asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRespuesta_pqrs() {
        return respuesta_pqrs;
    }

    public void setRespuesta_pqrs(String respuesta_pqrs) {
        this.respuesta_pqrs = respuesta_pqrs;
    }
}
