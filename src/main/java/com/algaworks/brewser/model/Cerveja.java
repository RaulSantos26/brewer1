package com.algaworks.brewser.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cerveja {
    private String sku;
    private String nome;

    private String descricao;

}
