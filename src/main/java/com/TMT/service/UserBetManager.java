//package com.TMT.service;
//
//import com.TMT.model.game.UserBet;
//import com.TMT.model.matches.Fixture;
//import com.TMT.model.users.Profile;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserBetManager implements InitializingBean {
//
//    private UserBetRepository userBetRepository;
//
//    public UserBetManager(UserBetRepository userBetRepository) {
//        this.userBetRepository = userBetRepository;
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//    }
//
//    public List<UserBet> getAllUserBetsByUser(Profile profile){
//        return userBetRepository.findUserBetByProfile(profile);
//    }
//
//
//}