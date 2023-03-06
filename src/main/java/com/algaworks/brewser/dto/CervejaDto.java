package com.algaworks.brewser.dto;

import com.algaworks.brewser.model.Cerveja;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CervejaDto {

    @NotBlank(message = "O Sku é obrigatório")
    private String sku;

    @NotBlank(message = "O Nome é obrigatório")
    private String nome;

    @Size(min = 1, max = 50, message = "Tamanho tem que ser de 1 a 50 caractéres")
    private String descricao;

    public CervejaDto(Cerveja entity){
        sku = entity.getSku();
        nome = entity.getNome();
        descricao = entity.getDescricao();
    }
}
