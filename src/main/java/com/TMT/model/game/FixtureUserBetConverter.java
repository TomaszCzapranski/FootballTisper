package com.TMT.model.game;

import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class FixtureUserBetConverter {
    List<Fixture> fixtureList;

    public FixtureUserBetConverter(List<Fixture> fixtureList) {
        this.fixtureList = fixtureList;
    }

    public List<UserBet> getFixturesToBet(Profile profile) {
        List<UserBet> userBets = new ArrayList<>();
        if (!CollectionUtils.isEmpty(profile.getBets())) {
            userBets = profile.getBets();
        } else {

            for (Fixture fixture : fixtureList

            ) {
                userBets.add(new UserBet(fixture, profile));

            }
        }
        return userBets;


    }
}

