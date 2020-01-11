package com.TMT.service;


import com.TMT.model.matches.Fixture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FixtureRepository extends JpaRepository<Fixture,Long> {

    List<Fixture> findFixtureByRoundAndLeague(int league_id, String round);
}

