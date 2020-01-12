package com.TMT.controller;

import com.TMT.model.game.GameManager;
import com.TMT.model.matches.ApiService;
import com.TMT.model.matches.RequestFactory;
import com.TMT.service.FixtureRepository;
import com.TMT.service.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;


@Component
public class Table {
    private RestTemplate restTemplate;
    private FixtureRepository fixtureRepository;
    private ProfileRepository profileRepository;



    @Autowired
    public Table(RestTemplate restTemplate, FixtureRepository fixtureRepository, ProfileRepository profileRepository) {
        this.restTemplate = restTemplate;
        this.fixtureRepository = fixtureRepository;
        this.profileRepository = profileRepository;
    }

    public void updadeRound(int league_id, int round) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        headers.set("x-rapidapi-key", "d98a7e39a9msh4c36542c88fb628p1be9f4jsnb47049c7faba");

        HttpEntity entity = new HttpEntity(headers);


        ResponseEntity<ApiService> response = restTemplate.exchange(RequestFactory.createRequestByRound(league_id, round), HttpMethod.GET, entity, ApiService.class);
        System.out.println(response);
        fixtureRepository.saveAll(response.getBody().getApi().getFixtures());
    }

    public void updateDay(int league_id, LocalDate date){
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        headers.set("x-rapidapi-key", "d98a7e39a9msh4c36542c88fb628p1be9f4jsnb47049c7faba");

        HttpEntity entity = new HttpEntity(headers);


        ResponseEntity<ApiService> response = restTemplate.exchange(RequestFactory.createRequestByDate(league_id, date), HttpMethod.GET, entity, ApiService.class);
        System.out.println(response);
        fixtureRepository.saveAll(response.getBody().getApi().getFixtures());

//        GameManager gameManager = new GameManager(profileRepository);
//
//        gameManager.updatePoints();

    }


}
