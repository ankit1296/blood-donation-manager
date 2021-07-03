package com.apk.donationManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apk.donationManager.model.JwtRequest;
import com.apk.donationManager.model.jwtResponse;
import com.apk.donationManager.service.CustomUserDetailService;
import com.apk.donationManager.utill.JwtUtil;



@RestController
public class JwtController {
	@Autowired
	private JwtUtil jwtUtils;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailService userDetailService;

	@PostMapping("/login")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) {
		System.out.println(jwtRequest);
		try {
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
	
			UserDetails userDetails = this.userDetailService.loadUserByUsername(jwtRequest.getUsername());
			
			String token = this.jwtUtils.generateToken(userDetails);
			
			System.out.println("token is: "+token);
			
			return ResponseEntity.ok(new jwtResponse(token));
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new UsernameNotFoundException("Bad credentials");
		}
		
	}

}
