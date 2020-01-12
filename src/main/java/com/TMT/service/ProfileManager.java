package com.TMT.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
