package com.TMT.model.users;

import com.TMT.model.matches.Fixture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.Set;

@Entity(name = "profile")
public class Profile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    private String email;

    private Long points;

    private Set<Fixture> placedBets;

    private List<Fixture> userBets;
}
