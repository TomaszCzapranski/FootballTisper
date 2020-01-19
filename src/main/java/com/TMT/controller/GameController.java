package com.TMT.controller;

import com.TMT.model.game.UserBet;
import com.TMT.service.FixtureRepository;
import com.TMT.service.ProfileManager;
import com.TMT.service.ProfileRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/game")
public class GameController {

    private FixtureRepository fixtureRepository;
    private ProfileManager profileManager;
    private ProfileRepository profileRepository;

    public GameController(FixtureRepository fixtureRepository, ProfileManager profileManager, ProfileRepository profileRepository) {
        this.fixtureRepository = fixtureRepository;
        this.profileManager = profileManager;
        this.profileRepository = profileRepository;
    }

    @PostMapping("/editBet")
    public RedirectView updateUserBet(UserBet userBet) {
        ProfileManager.updateUserBet(userBet);
        return new RedirectView("/bet");
    }
}
