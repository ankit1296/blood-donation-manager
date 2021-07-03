package com.apk.donationManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apk.donationManager.entity.UserDetails;

public interface UserDetailRepository extends JpaRepository<UserDetails, Integer> {

}
