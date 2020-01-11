package com.TMT.model.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "profile")
public class Profile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    private String email;

    private Long points;


}
