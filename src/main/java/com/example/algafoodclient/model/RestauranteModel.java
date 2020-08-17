package com.example.algafoodclient.model;/*
 *  @criado em: 17/08/2020 - {13:29}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RestauranteModel {

    private Long id;
    private String nome;
    private BigDecimal taxaFrete;
    private Boolean ativo;
    private Boolean aberto;

    private CozinhaModel cozinha;
    private EnderecoModel endereco;

}
