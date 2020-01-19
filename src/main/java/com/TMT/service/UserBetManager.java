package com.TMT.service;

import com.TMT.model.game.UserBet;
import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserBetManager implements InitializingBean {

    private UserBetRepository userBetRepository;

    public UserBetManager(UserBetRepository userBetRepository) {
        this.userBetRepository = userBetRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

//    public List<UserBet> getAllUserBetsByUser(Profile profile){
//        return userBetRepository.findById();
//    }

    public void updateUserBet(UserBet userBet, Long id){

//        UserBetRepository.saveAndFlush(userBet);


        Optional<UserBet> bet = userBetRepository.findById(id);
//        Cat existingCat = catRepository.findById(id).orElseThrow(CatNotFoundException::new);
        bet.get().setAwayGoalsBet(userBet.getAwayGoalsBet());
        bet.get().setHomeGoalsBet(userBet.getHomeGoalsBet());
        userBetRepository.save(userBet);


    }


    }

    //    public static RedirectView updateUserBet(UserBet userBet) {
//        EntityManager em = HibernateUtil.getEntityManager();
//        em.getTransaction().begin();
////        UserBet existUserBet= em.find(Profile.class, userBet.getProfile()).getBets().get(userBet.getUser_bet_id());
//        Profile existProfile = em.find(Profile.class, userBet.getProfile());
//        long index = userBet.getUser_bet_id();
//        UserBet existUserBet = existProfile.getBets().get((int)index);
//        if (existUserBet != null) {
//            em.merge(userBet);
//        }
//        em.getTransaction().commit();
//        return new RedirectView("/bet");
//    }
//}
