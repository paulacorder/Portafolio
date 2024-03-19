package com.example.demo.service;

import com.example.demo.demain.Producto;
import java.util.List;

public interface ProductoService {

    // Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);

    // Se obtiene un Categoria a partir de su ID
    public Producto getProducto(Producto id);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto producto);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
