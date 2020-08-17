package com.example.algafoodclient.model;
/*
 *  @criado em: 17/08/2020 - {13:28}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import lombok.Data;

@Data
public class CidadeResumoModel {
    private Long id;
    private String nome;
    private String estado;
}
