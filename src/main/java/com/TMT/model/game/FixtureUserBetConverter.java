package com.TMT.model.game;

import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;

import java.util.List;

public class FixtureUserBetConverter {


    public List<UserBet> getFixturesToBet(List<Fixture> fixtures, Profile profile) {

        List<UserBet> userBets = null;
        for (Fixture fixture : fixtures
        ) {
            userBets.add(new UserBet(fixture, profile));

        }
        return userBets;


    }
}

