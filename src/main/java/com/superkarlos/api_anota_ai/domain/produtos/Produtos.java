package com.superkarlos.api_anota_ai.domain.produtos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.superkarlos.api_anota_ai.domain.categorias.Categorias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "produtos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Produtos {
    @Id
    private String id;
    private String titulo;
    private String descricao;
    private String owId;
    private Long  preco;

    private Categorias categorias;


}
