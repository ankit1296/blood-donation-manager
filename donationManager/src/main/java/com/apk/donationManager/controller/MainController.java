package com.apk.donationManager.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apk.donationManager.entity.Address;
import com.apk.donationManager.entity.User;
import com.apk.donationManager.entity.UserDetails;
import com.apk.donationManager.repository.AddressRepository;
import com.apk.donationManager.repository.UserDetailRepository;
import com.apk.donationManager.repository.UsersRepositoray;

@RestController
public class MainController {
	
	@Autowired
	UsersRepositoray userRepo;
	
	@Autowired
	UserDetailRepository userDetailRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

	@GetMapping("/user-add")
	public String addUser() {
		Address ad = new Address();
		ad.setCity("Pune");
		ad.setCountry("India");
		ad.setDistrict("Pune");
		ad.setLandmark("Monika B4");
		ad.setState("Maharashtra");
		ad.setTaluka("Pune");
		
		
		UserDetails ud = new UserDetails();
		ud.setEmailId("apkarve@gmail.com");
		ud.setLastName("Karve");
		ud.setFirstName("Ankit");
		ud.setPhoneNo("80043434");
		ud.setAddress(ad);
		
		User u = new User();
		u.setAdmin(true);
		u.setUsername("apk");
		u.setPassword("root");
		u.setUserDetails(ud);
		ud.setUser(u);
		ad.setUserDetails(ud);
		userRepo.save(u);
		
		
		return "Users added";
	}
	
	@GetMapping("/user")
	public ArrayList<User> getUser() {
		
		
		
		return this.userRepo.findByUsername("apk");
	}

}
