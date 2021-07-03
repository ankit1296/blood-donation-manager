package com.apk.donationManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apk.donationManager.entity.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Integer> {

}
