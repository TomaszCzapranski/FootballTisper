package com.TMT.service;

import com.TMT.model.game.UserBet;
import com.TMT.model.users.Profile;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class ProfileManager implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    private ProfileRepository profileRepository;

    @Autowired
    public ProfileManager(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public void addProfile(Profile profile) {
        profileRepository.save(profile);
    }

    public void delete(String name) {
        profileRepository.findByName(name);
        profileRepository.deleteByName(name);
    }

    public void updateProfile(String name) {

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
}