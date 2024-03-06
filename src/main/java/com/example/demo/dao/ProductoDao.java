
package com.example.demo.dao;

import com.example.demo.demain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
