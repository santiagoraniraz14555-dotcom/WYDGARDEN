package com.proyecto.conexion.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "detalles_ventas")
public class DetallesVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalles_ventas;

    @NotNull(message = "La venta no puede ser nula")
    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Ventas venta;

    @NotNull(message = "El producto no puede ser nulo")
    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @Positive(message = "El precio unitario debe ser mayor que 0")
    private double precio_unitario;

    @Min(value = 1, message = "La cantidad debe ser mínimo 1")
    private int cantidad;

    @PositiveOrZero(message = "El subtotal no puede ser negativo")
    private double subtotal;

    // Getters y setters

    public int getId_detalles_ventas() {
        return id_detalles_ventas;
    }

    public void setId_detalles_ventas(int id_detalles_ventas) {
        this.id_detalles_ventas = id_detalles_ventas;
    }

    public Ventas getVenta() {
        return venta;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
