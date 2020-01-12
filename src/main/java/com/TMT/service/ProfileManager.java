package com.TMT.service;

import com.TMT.model.users.Profile;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Profile> getAllProfiles(){
        return profileRepository.findAll();
    }

    public void addProfile(Profile profile){
        profileRepository.save(profile);
    }

    public void delete(Long id)  {
        profileRepository.findById(id);
        profileRepository.deleteById(id);
    }

    public void updateProfile(Long id){

    }

}
