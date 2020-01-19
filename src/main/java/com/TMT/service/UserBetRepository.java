package com.TMT.service;

        import com.TMT.model.game.UserBet;
        import com.TMT.model.users.Profile;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.util.List;

public interface UserBetRepository extends JpaRepository<UserBet,Long> {





//    List<UserBet> findUserBetByProfile(Profile user);

}