package com.TMT.service;

import com.TMT.model.game.UserBet;
import com.TMT.model.matches.Fixture;
import com.TMT.model.users.Profile;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBetManager implements InitializingBean {

    private UserBetRepository userBetRepository;

    public UserBetManager(UserBetRepository userBetRepository) {
        this.userBetRepository = userBetRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    public List<UserBet> getAllUserBetsByUser(Profile profile){
        return userBetRepository.findUserBetByProfile(profile);
    }

    public static void updateUserBet(UserBet userBet){

//        UserBetRepository.saveAndFlush(userBet);

        List<UserBet> allUserBets = UserBetRepository.findAll().contains(userBet.getProfile());
        long index = userBet.getUser_bet_id();


    }




        UserBetRepository.findBetByProfile(userBet.getProfile());
        UserBet existUserBet = UserBetRepository.findUserBetByProfile(userBet.getProfile()).get(userBet.getUser_bet_id());
        UserBetRepository.merge()


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
}