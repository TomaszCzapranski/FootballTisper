package com.TMT.controller;

import com.TMT.model.game.GameManager;
import com.TMT.model.game.UserBet;
import com.TMT.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/secure/game")
public class GameController {

    private FixtureRepository fixtureRepository;
    private ProfileManager profileManager;
    private ProfileRepository profileRepository;
    private UserBetManager userBetManager;
    private GameManager gameManager;


    public GameController(FixtureRepository fixtureRepository, ProfileManager profileManager, ProfileRepository profileRepository, UserBetManager userBetManager) {
        this.fixtureRepository = fixtureRepository;
        this.profileManager = profileManager;
        this.profileRepository = profileRepository;
        this.userBetManager = userBetManager;
    }

    @PostMapping("/editBet/{id}")
    public RedirectView updateUserBet(@PathVariable Long id, UserBet userBet) {

        userBetManager.updateUserBet(id, userBet);

        return new RedirectView("/bettedFixtures");
    }


}
