package com.TMT.service;

import com.TMT.model.users.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    List<Profile> findProfileByName(String name);
    List<Profile> findProfileByEmail(String email);
    List<Profile> findProfileById(Long id);




}
