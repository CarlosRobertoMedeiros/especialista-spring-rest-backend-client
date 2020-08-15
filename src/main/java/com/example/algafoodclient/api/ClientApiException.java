package com.example.algafoodclient.api;
/*
 *  @criado em: 14/08/2020 - {06:32}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import org.springframework.web.client.RestClientResponseException;

public class ClientApiException extends RuntimeException {

    public ClientApiException(String mensagem, RestClientResponseException cause){
        super(mensagem, cause);

    }





}
