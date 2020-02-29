package com.TMT.model.game;


import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;

import javax.persistence.*;

@Entity
public class UserBet {

    public UserBet() {
    }

    public UserBet(Fixture fixture, Profile profile){
        this.fixture = fixture;
        this.HomeGoalsBet = null;
        this.AwayGoalsBet = null;
        this.points= null;
        this.profile = profile;
    }

    @Id
    @GeneratedValue
    Long user_bet_id;
    @OneToOne
    private Fixture fixture;
    @Column(nullable = true)
    Integer HomeGoalsBet;
    @Column(nullable = true)
    Integer AwayGoalsBet;
    @Column(nullable = true)
    Integer points;
    @ManyToOne
    Profile profile;

    public Long getUser_bet_id() {
        return user_bet_id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public Integer getHomeGoalsBet() {

       return HomeGoalsBet;
    }





    public String getHomeGoalsBetString() {
        return HomeGoalsBet.toString();
    }

    public void setHomeGoalsBet(Integer homeGoalsBet) {
        HomeGoalsBet = homeGoalsBet;
    }

    public Integer getAwayGoalsBet() {
            return AwayGoalsBet;



    }


    public String getAwayGoalsBetString() {
        return AwayGoalsBet.toString();
    }

    public void setAwayGoalsBet(Integer awayGoalsBet) {
        AwayGoalsBet = awayGoalsBet;
    }
}
