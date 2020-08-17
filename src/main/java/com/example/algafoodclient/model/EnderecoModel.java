package com.example.algafoodclient.model;/*
 *  @criado em: 17/08/2020 - {13:29}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import lombok.Data;

@Data
public class EnderecoModel {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private CidadeResumoModel cidade;

}
