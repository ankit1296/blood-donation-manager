package com.apk.donationManager.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apk.donationManager.entity.User;

public interface UsersRepositoray extends JpaRepository<User, Integer> {
    ArrayList<User> findByUsername(String username);
}
