/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.demain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author paula
 */
@Data 
@Entity 
@Table(name="producto") 
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto; // hibe
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    private Long idCategoria;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo, Long idCategoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        this.idCategoria = idCategoria;
    }
    
    
}
