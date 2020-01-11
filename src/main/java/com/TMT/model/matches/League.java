package com.TMT.model.matches;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "league")
public class League {
    @Id
    int league_id;
    String name;
    String country;

    public int getLeague_id() {
        return league_id;
    }

    public void setLeague_id(int league_id) {
        this.league_id = league_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
