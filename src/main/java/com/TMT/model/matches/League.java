package com.TMT.model.matches;

public class League {
    int id;
    String name;
    String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public League(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }


}
