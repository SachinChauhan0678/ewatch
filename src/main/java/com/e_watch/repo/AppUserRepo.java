package com.e_watch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_watch.entity.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

}
