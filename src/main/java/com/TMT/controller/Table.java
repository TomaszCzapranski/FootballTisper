package com.TMT.controller;

import com.TMT.model.matches.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Table {
    private RestTemplate restTemplate;

    @Autowired
    public Table(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void neccesaryMethod(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        headers.set("x-rapidapi-key", "d98a7e39a9msh4c36542c88fb628p1be9f4jsnb47049c7faba");

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<ApiService> response = restTemplate.exchange(
                "https://api-football-v1.p.rapidapi.com/v2/fixtures/league/2/Regular_Season_-_11?timezone=Europe/London", HttpMethod.GET, entity, ApiService.class);
        System.out.println(response);


    }



}
