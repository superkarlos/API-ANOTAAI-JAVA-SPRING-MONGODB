package com.superkarlos.api_anota_ai.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.superkarlos.api_anota_ai.domain.categorias.Categorias;

/**
 * RepositoryCategoria
 */
@Repository
public interface RepositoryCategoria extends MongoRepository<Categorias, String> {
 
    
} 