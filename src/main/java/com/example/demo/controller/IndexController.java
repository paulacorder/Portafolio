
package com.example.demo.controller;

import com.example.demo.demain.Categoria;
import com.example.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    
    
    @RequestMapping("/")
    public String page(Model model) {
        // Obtener las categorías del servicio
        
        
        return "index";
    }
    
}
