package com.superkarlos.api_anota_ai.services;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superkarlos.api_anota_ai.domain.categorias.Categorias;
import com.superkarlos.api_anota_ai.domain.dto.CategoriasDto;
import com.superkarlos.api_anota_ai.domain.execptionscustons.CategoriExecption;
import com.superkarlos.api_anota_ai.repositories.RepositoryCategoria;
import java.util.List;
import java.util.Optional;
@Service
public class CategoriasServices {

    @Autowired
    private RepositoryCategoria repostory;


    public Categorias insert ( CategoriasDto dto){
        Categorias  data = new Categorias();
        BeanUtils.copyProperties(dto, data);
        this.repostory.save(data);
        return data;
    }

    public List<Categorias> findAll(){
        return repostory.findAll();
    } 

    public Categorias uptade(String id, CategoriasDto categoriasDto){

        Optional<Categorias> user = repostory.findById(id);
        if(user.isEmpty()){
            throw new CategoriExecption();
        }

        Categorias newcCategorias = user.get();
        this.repostory.save(newcCategorias);
        return newcCategorias;
    }

    public String dell( String id){
        Optional<Categorias> user = repostory.findById(id);
        if(user.isEmpty()){
            throw new CategoriExecption();
        }
        repostory.deleteById(id);
        return "Deletado";
    }
}
