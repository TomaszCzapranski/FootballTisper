package com.TMT.model.game;

import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;
import com.TMT.service.FixtureRepository;
import com.TMT.service.ProfileRepository;
import com.TMT.service.UserBetManager;
import com.TMT.service.UserBetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.List;

@Component
public class GameManager {


    private ProfileRepository profileRepository;
    private FixtureRepository fixtureRepository;
    private UserBetRepository userBetRepository;
    private PointCounter pointCounter;


    @Autowired
    public GameManager(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public void updatePoints() {
        for (Profile profile : profileRepository.findAll()) {
            pointCounter.countPoints(profile);
        }
    }
}















