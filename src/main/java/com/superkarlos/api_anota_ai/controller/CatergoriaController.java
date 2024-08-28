package com.superkarlos.api_anota_ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superkarlos.api_anota_ai.domain.categorias.Categorias;
import com.superkarlos.api_anota_ai.domain.dto.CategoriasDto;
import com.superkarlos.api_anota_ai.services.CategoriasServices;
import java.util.List;
/**
 * CatergoriaController
 */
@RestController
@RequestMapping("/api/Categorias")
public class CatergoriaController {
     
     @Autowired
     private CategoriasServices services;

     @GetMapping("/list")
     public ResponseEntity<List<Categorias>> getdAll(){
         return ResponseEntity.ok().body(this.services.findAll());
     }

    @PostMapping("/inserir")
    public ResponseEntity<Categorias> insert( @RequestBody CategoriasDto categoriasDto){
            return ResponseEntity.ok().body(this.services.insert(categoriasDto));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Categorias> update(@PathVariable(value = "id") String id, @RequestBody CategoriasDto categoriasDto){
        return ResponseEntity.ok().body(this.services.uptade(id,categoriasDto));
    }
        

    
    @PutMapping("/delet/{id}")
    public ResponseEntity<String> dell(@PathVariable(value = "id") String id){
        return ResponseEntity.ok().body(this.services.dell(id));
    }
        

    
}