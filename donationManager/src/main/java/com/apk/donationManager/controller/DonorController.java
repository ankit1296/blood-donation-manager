package com.apk.donationManager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apk.donationManager.entity.Donor;
import com.apk.donationManager.model.DonorModel;
import com.apk.donationManager.repository.DonorRepository;

@RestController
public class DonorController {
	
	@Autowired
	DonorRepository donorRepo;
	
	private final static Logger logger = LoggerFactory.getLogger(DonorController.class);
	
	@PostMapping("/add-donor")
	public ResponseEntity<DonorModel> addDonor(@RequestBody DonorModel donor) {
		
		if(donor != null) {
			Donor newDonor = new Donor();
			newDonor.setAddress(donor.getAddress());
			newDonor.setDonorName(donor.getDonorName());
			newDonor.setBloodGroup(donor.getBloodGroup());
			newDonor.setDonorWeight(donor.getDonorWeight());
			newDonor.setDonorContact(donor.getDonorContact());
			newDonor.setAnyMedicalhistory(donor.isAnyMedicalhistory());
			newDonor.setDonorEmail(donor.getDonorEmail());
			donorRepo.save(newDonor);
			logger.info("Donor saved"+donor);
			
			return ResponseEntity.ok(donor);
			
		}
		
		 logger.error("[DonorController] Error occured while adding donor");
		 return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		
		
	}

}
