package com.TMT.model.matches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Api {
    List<Fixtures> fixtures;
    int results;

    @Autowired
    public Api(List<Fixtures> fixtures) {
        this.fixtures = fixtures;

    }

    public Api() {
    }

    public List<Fixtures> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixtures> fixtures) {
        this.fixtures = fixtures;
    }
}
