package com.TMT.security;

import com.TMT.model.users.CustomUserDetails;
import com.TMT.model.users.Profile;
import com.TMT.service.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private ProfileRepository profileRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Profile> optionalProfile = profileRepository.findByName(username);
        optionalProfile
                .orElseThrow(() -> new UsernameNotFoundException("User Name not found"));
        return optionalProfile.map(CustomUserDetails::new).get();
    }
}
