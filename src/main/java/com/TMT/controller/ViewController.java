package com.TMT.controller;

import com.TMT.model.users.Profile;
import com.TMT.service.FixtureRepository;
import com.TMT.service.ProfileManager;
import com.TMT.service.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class ViewController {

    private FixtureRepository fixtureRepository;
    private ProfileManager profileManager;
    private ProfileRepository profileRepository;

    @Autowired
    public ViewController(FixtureRepository fixtureRepository, ProfileManager profileManager, ProfileRepository profileRepository) {
        this.fixtureRepository = fixtureRepository;
        this.profileManager = profileManager;
        this.profileRepository = profileRepository;
    }

    @GetMapping
    public String showFixtures(Model model) {
        model.addAttribute("fixtureList", fixtureRepository.findAll());
        return "index";

    }

    @GetMapping ("/profile")
    public String showProfile(Model model) {
        model.addAttribute("profileList", profileRepository.findAll());
        return "profile";

    }
    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping
    public RedirectView addCat(Profile profile) {
        profileManager.addProfile(profile);
        return new RedirectView("/");
    }

    @GetMapping("/betting")
    public String bettingForm(Model model) {
        model.addAttribute("bettingList", fixtureRepository.findAll());
        return "bet";
    }
}
