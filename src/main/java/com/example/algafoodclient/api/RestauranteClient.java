package com.example.algafoodclient.api;
/*
 *  @criado em: 14/08/2020 - {06:32}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import com.example.algafoodclient.model.Input.RestauranteInput;
import com.example.algafoodclient.model.RestauranteModel;
import com.example.algafoodclient.model.RestauranteResumoModel;
import lombok.AllArgsConstructor;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class RestauranteClient {

    private static final String RESOURCE_PATH = "/restaurantes";

    private RestTemplate restTemplate;
    private String url = "http://api.algafood.local:8080";

    public List<RestauranteResumoModel> listar(){
        try {
            URI resourceUri = URI.create(url + RESOURCE_PATH);

            RestauranteResumoModel[] restaurantes = restTemplate
                    .getForObject(resourceUri, RestauranteResumoModel[].class);

            return Arrays.asList(restaurantes);
        }catch(RestClientResponseException e){
            throw new ClientApiException(e.getMessage(),e);
        }
    }

    public RestauranteModel adicionar(RestauranteInput restaurante) {
        URI resourceUri = URI.create(url + RESOURCE_PATH);

        try {
            return restTemplate
                    .postForObject(resourceUri, restaurante, RestauranteModel.class);
        } catch (HttpClientErrorException e) {
            throw new ClientApiException(e.getMessage(), e);
        }
    }
}
