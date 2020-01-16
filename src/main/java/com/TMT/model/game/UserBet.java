package com.TMT.model.game;


import com.TMT.model.matches.Fixture;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserBet {

    public UserBet() {
    }

    public UserBet(Fixture fixture){
        this.fixture = fixture;

    }

    @Id
    int user_bet_id;
    @OneToOne
    private Fixture fixture;
    int HomeGoalsBet;
    int AwayGoalsBet;
    int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public int getHomeGoalsBet() {
        return HomeGoalsBet;
    }

    public void setHomeGoalsBet(int homeGoalsBet) {
        HomeGoalsBet = homeGoalsBet;
    }

    public int getAwayGoalsBet() {
        return AwayGoalsBet;
    }

    public void setAwayGoalsBet(int awayGoalsBet) {
        AwayGoalsBet = awayGoalsBet;
    }
}
