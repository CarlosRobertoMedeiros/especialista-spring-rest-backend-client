package com.example.algafoodclient.model.Input;
/*
 *  @criado em: 17/08/2020 - {13:27}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RestauranteInput {

    private String nome;
    private BigDecimal taxaFrete;

    private CozinhaIdInput cozinha;
    private EnderecoInput endereco;

}
