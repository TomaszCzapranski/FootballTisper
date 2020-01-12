package com.TMT.model.matches;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;

@Entity(name = "fixtures")
public class Fixture {

    @Id
    Long fixture_id;
    String statusShort;
    OffsetDateTime event_date;
    String round;
    @OneToOne(cascade = CascadeType.ALL)
    League league;
    @OneToOne(cascade = CascadeType.ALL)
    HomeTeam homeTeam;
    @OneToOne(cascade = CascadeType.ALL)
    AwayTeam awayTeam;
    Integer goalsHomeTeam;
    Integer goalsAwayTeam;
    String result;

    public String getResult() {
        if (!(goalsAwayTeam == null)&&!(goalsHomeTeam==null)){
            result = goalsHomeTeam + "-" + goalsAwayTeam;
        } else {
            result = " ";
        }
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



    public Long getFixture_id() {
        return fixture_id;
    }

    public void setFixture_id(Long fixture_id) {
        this.fixture_id = fixture_id;
    }

    public String getStatusShort() {
        return statusShort;
    }

    public void setStatusShort(String statusShort) {
        this.statusShort = statusShort;
    }

    public OffsetDateTime getEvent_date() {
        return event_date;
    }

    public void setEvent_date(OffsetDateTime event_date) {
        this.event_date = event_date;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(Integer goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public Integer getGoalsAwayTeam() {
        return goalsAwayTeam;
    }

    public void setGoalsAwayTeam(Integer goalsAwayTeam) {
        this.goalsAwayTeam = goalsAwayTeam;
    }
}
