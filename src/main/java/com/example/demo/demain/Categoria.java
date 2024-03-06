
package com.example.demo.demain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data 
@Entity 
@Table(name="categoria") 
public class Categoria implements Serializable{  // permite que cuando guarde datos podamos envertir en algo que  pueda revisar mysql
    
    private static final long serialVersionUID = 1L;
    
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria; // hibernate trasnforma en id_ categora
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }
    
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

    
    
}
