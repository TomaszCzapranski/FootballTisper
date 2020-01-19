package com.TMT.service;

import com.TMT.model.users.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByName(String tomek);
    void deleteByName(String tomek);



//    List<Profile> findProfileByName(String name);
//    List<Profile> findProfileByEmail(String email);
//    List<Profile> findProfileById(Long id);




}
