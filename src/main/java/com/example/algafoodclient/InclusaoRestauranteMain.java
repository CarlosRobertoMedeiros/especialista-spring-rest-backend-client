package com.example.algafoodclient;
/*
 *  @criado em: 17/08/2020 - {13:31}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import com.example.algafoodclient.api.ClientApiException;
import com.example.algafoodclient.api.RestauranteClient;
import com.example.algafoodclient.model.Input.CidadeIdInput;
import com.example.algafoodclient.model.Input.CozinhaIdInput;
import com.example.algafoodclient.model.Input.EnderecoInput;
import com.example.algafoodclient.model.Input.RestauranteInput;
import com.example.algafoodclient.model.RestauranteModel;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

public class InclusaoRestauranteMain {

    public static void main(String [] args){
        try {
            RestTemplate restTemplate = new RestTemplate();
            RestauranteClient restauranteClient = new RestauranteClient(
                    restTemplate, "http://api.algafood.local:8080");

            CozinhaIdInput cozinha = new CozinhaIdInput();
            cozinha.setId(1L);

            CidadeIdInput cidade = new CidadeIdInput();
            cidade.setId(1L);

            EnderecoInput endereco = new EnderecoInput();
            endereco.setCidade(cidade);
            endereco.setCep("38500-111");
            endereco.setLogradouro("Rua Xyz");
            endereco.setNumero("300");
            endereco.setBairro("Centro");

            RestauranteInput restaurante = new RestauranteInput();
            restaurante.setNome("Comida Mineira");
            restaurante.setTaxaFrete(new BigDecimal(9.5));
            restaurante.setCozinha(new CozinhaIdInput());
            restaurante.setCozinha(cozinha);
            restaurante.setEndereco(endereco);

            RestauranteModel restauranteModel = restauranteClient.adicionar(restaurante);

            System.out.println(restauranteModel);
        } catch (ClientApiException e) {
            if (e.getProblem() != null) {
                System.out.println(e.getProblem().getUserMessage());

                e.getProblem().getObjects().stream()
                        .forEach(p -> System.out.println("- " + p.getUserMessage()));

            } else {
                System.out.println("Erro desconhecido");
                e.printStackTrace();
            }
        }
    }
}


