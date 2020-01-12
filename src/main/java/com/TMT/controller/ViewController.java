package com.TMT.controller;

import com.TMT.service.FixtureManager;
import com.TMT.service.FixtureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

    private FixtureRepository fixtureRepository;

    @Autowired
    public ViewController(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    @GetMapping
    public String showFixtures(Model model) {
        model.addAttribute("fixtureList", fixtureRepository.findAll());
        return "index";

    }
}
