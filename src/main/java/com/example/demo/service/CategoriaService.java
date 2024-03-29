
package com.example.demo.service;

import com.example.demo.demain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
    // Se obtiene un Categoria a partir de su ID
    public Categoria getCategoria(Categoria id);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
    
    
    public List<Categoria> buscarPorDescripcion(String descripcion);
    
    
    

    
}


