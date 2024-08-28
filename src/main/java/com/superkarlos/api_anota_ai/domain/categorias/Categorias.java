package com.superkarlos.api_anota_ai.domain.categorias;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "categorias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorias {
     @Id
    private String id_;
    private String titulo;
    private String descrição;
    private String owId;
    
}
