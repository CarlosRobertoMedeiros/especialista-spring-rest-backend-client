package com.example.algafoodclient.model;
/*
 *  @criado em: 14/08/2020 - {06:44}
 *  @projeto  : algafood-api
 *  @autor    : roberto
 */

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Problem {

    private Integer status;
    private OffsetDateTime timestamp;
    private String userMessage;
    private List<Object> objects = new ArrayList<>();

    @Data
    public static class Object {

        private String name;
        private String userMessage;

    }

}
