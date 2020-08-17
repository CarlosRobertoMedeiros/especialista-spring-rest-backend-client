package com.example.algafoodclient.model.Input;
/*
 *  @criado em: 17/08/2020 - {13:25}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import lombok.Data;

@Data
public class EnderecoInput {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private CidadeIdInput cidade;

}
