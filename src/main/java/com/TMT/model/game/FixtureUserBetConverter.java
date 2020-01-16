package com.TMT.model.game;

import com.TMT.model.matches.Fixture;

import java.util.List;

public class FixtureUserBetConverter {


    public List<UserBet> getFixturesToBet(List<Fixture> fixtures) {

        List<UserBet> userBets = null;
        for (Fixture fixture : fixtures
        ) {
            userBets.add(new UserBet(fixture));

        }
        return userBets;


    }
}

