package com.apk.donationManager.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.apk.donationManager.repository.UsersRepositoray;

@Service
public class CustomUserDetailService  implements UserDetailsService{
	
	@Autowired
	UsersRepositoray userRepo;
	
//	Logger logger = new Logger()

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		com.apk.donationManager.entity.User user = userRepo.findByUsername(username).get(0);
		if(user!= null) {
			return new User(user.getUsername(), user.getPassword(),new ArrayList<>());
		} 
		
		else {
			throw new UsernameNotFoundException("User not found");
		}
	}

}
