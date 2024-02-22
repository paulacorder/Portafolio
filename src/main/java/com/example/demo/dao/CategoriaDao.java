
package com.example.demo.dao;

import com.example.demo.demain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
