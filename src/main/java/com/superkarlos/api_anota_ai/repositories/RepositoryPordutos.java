package com.superkarlos.api_anota_ai.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.superkarlos.api_anota_ai.domain.produtos.Produtos;

@Repository
public interface RepositoryPordutos  extends MongoRepository<Produtos,String>{
    
}
