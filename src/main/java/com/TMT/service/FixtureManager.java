package com.TMT.service;

import com.TMT.model.matches.Fixture;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FixtureManager implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    private FixtureRepository fixtureRepository;

    @Autowired
    public FixtureManager(FixtureRepository fixtureRepository) {
        this.fixtureRepository = fixtureRepository;
    }

    public List<Fixture>getAllFixturesByRound(){
        return fixtureRepository.findAll();
    }

    public void saveFixture(Fixture fixture){
      fixtureRepository.save(fixture);


    }

    public void updadeFixture(Fixture fixture){
        fixtureRepository.save(fixture);

}

}