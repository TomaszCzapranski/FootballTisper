package com.TMT.model.game;


import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserBet {

    public UserBet() {
    }

    public UserBet(Fixture fixture, Profile profile){
        this.fixture = fixture;
        this.user_bet_id=profile.getId();
        this.HomeGoalsBet = Integer.parseInt(null);
        this.AwayGoalsBet = Integer.parseInt(null);
        this.points=Integer.parseInt(null);
    }

    @Id
    Long user_bet_id;
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
