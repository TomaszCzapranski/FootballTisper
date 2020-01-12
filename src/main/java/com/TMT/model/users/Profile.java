package com.TMT.model.users;

import com.TMT.model.game.UserBet;
import com.TMT.model.matches.Fixture;
import org.graalvm.compiler.lir.LIRInstruction;

import javax.persistence.*;
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
    private String status;

    private Long points;
    @OneToMany
    private List<UserBet> bets;


//    private Set<Fixture> placedBets;


    public List<UserBet> getBets() {
        return bets;
    }
}
