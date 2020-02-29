package com.TMT.controller;

import com.TMT.model.game.GameManager;
import com.TMT.model.game.PointCounter;
import com.TMT.model.game.UserBet;
import com.TMT.model.users.Profile;
import com.TMT.service.FixtureRepository;
import com.TMT.service.ProfileManager;
import com.TMT.service.ProfileRepository;
//import com.TMT.service.UserBetRepository;
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
import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class ViewController {

    private FixtureRepository fixtureRepository;
    private ProfileManager profileManager;
    private ProfileRepository profileRepository;


//    private UserBetRepository userBetRepository;

//    @Autowired
//    public ViewController(FixtureRepository fixtureRepository, ProfileManager profileManager, ProfileRepository profileRepository, UserBetRepository userBetRepository) {
//        this.fixtureRepository = fixtureRepository;
//        this.profileManager = profileManager;
//        this.profileRepository = profileRepository;
//        this.userBetRepository = userBetRepository;
//    }

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
        List<Profile> profileList = profileRepository.findAll();
        System.out.println("Liczba profili: " + profileList.size());
        model.addAttribute("profileList", profileList);

//        PointCounter pointCounter = new PointCounter(1,1,1);
//        List<Profile>profileList = profileRepository.findAll();
//  e      for (Profile profile:profileList) {
//            pointCounter.countPoints(profile);
//
//            }
//        model.addAttribute("bettedFixturesList", profileList);
        return "profile";
    }


    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping
    public RedirectView addCat(Profile profile) {
        profile.setPoints((long) 0);
        profile.setStatus("default");
        profileManager.addProfile(profile);
        return new RedirectView("/");
    }

//    @GetMapping("/betting")
//    public String bettingForm(Model model, Principal principal) {
//        model.addAttribute("bettingList", userBetRepository.findAll());
//        Optional<Profile> profile = profileRepository.findProfileByName(principal.getName());
//                if(profile.isPresent()) {
//                    profile.get().
//                } else {
//
//                }
    @GetMapping("/bet")
            public String bettingForm(Model model){
//                model.addAttribute("bettingList", UserBetRepository.findAll());
                Optional<Profile> profile = profileRepository.findByName("tomek");
                if(profile.isPresent()){
                    model.addAttribute("bettingList", profile.get().getBets());
                    return "bet";

                }else return "profileNotFoundException";

    }

    @GetMapping("/bettedFixtures")
    public String betedFixtures(Model model){
        Optional<Profile> profile = profileRepository.findByName("tomek");
        if(profile.isPresent()){
            model.addAttribute("bettingList", profile.get().getBets());
            return "bettedFixtures";

        }else return "profileNotFoundException";
    }


}
