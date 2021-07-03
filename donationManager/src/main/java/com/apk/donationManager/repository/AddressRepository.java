package com.apk.donationManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apk.donationManager.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
