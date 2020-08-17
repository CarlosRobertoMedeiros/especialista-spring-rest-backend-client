package com.example.algafoodclient;
/*
 *  @criado em: 14/08/2020 - {06:48}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */
import com.example.algafoodclient.api.ClientApiException;
import com.example.algafoodclient.api.RestauranteClient;
import org.springframework.web.client.RestTemplate;

public class ListagemRestauranteMain {

    public static void main(String[] args) {

        try {
            RestTemplate restTemplate = new RestTemplate();

            RestauranteClient restauranteClient = new RestauranteClient(
                    restTemplate, "http://api.algafood.local:8080");

            restauranteClient.listar().stream()
                    .forEach(restaurante -> System.out.println(restaurante));
        }catch (ClientApiException e){
            if(e.getProblem()!= null){
                System.out.println(e.getProblem());
                System.out.println(e.getProblem().getUserMessage());
            }else {
                System.out.println("Erro desconhecido");
                e.printStackTrace();
            }
        }
    }

}
