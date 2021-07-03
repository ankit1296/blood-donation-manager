package com.apk.donationManager.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "donor")
public class Donor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer donorId;
	
	@Column
	String donorName;
	
	@Column
	String donorContact;
	
	@Column
	String donorEmail;
	
	@Column
	boolean isAnyMedicalhistory;
	
	@Column
	String bloodGroup;
	
	@Column
	String donorWeight;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	Address address;
	
	public Donor() {
		
	}


	public Donor(Integer donorId, String donorName, String donorContact, String donorEmail, boolean isAnyMedicalhistory,
			String bloodGroup, String donorWeight, Address address) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.donorContact = donorContact;
		this.donorEmail = donorEmail;
		this.isAnyMedicalhistory = isAnyMedicalhistory;
		this.bloodGroup = bloodGroup;
		this.donorWeight = donorWeight;
		this.address = address;
	}


	public Integer getDonorId() {
		return donorId;
	}


	public void setDonorId(Integer donorId) {
		this.donorId = donorId;
	}


	public String getDonorName() {
		return donorName;
	}


	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}


	public String getDonorContact() {
		return donorContact;
	}


	public void setDonorContact(String donorContact) {
		this.donorContact = donorContact;
	}


	public String getDonorEmail() {
		return donorEmail;
	}


	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}


	public boolean isAnyMedicalhistory() {
		return isAnyMedicalhistory;
	}


	public void setAnyMedicalhistory(boolean isAnyMedicalhistory) {
		this.isAnyMedicalhistory = isAnyMedicalhistory;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public String getDonorWeight() {
		return donorWeight;
	}


	public void setDonorWeight(String donorWeight) {
		this.donorWeight = donorWeight;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", donorName=" + donorName + ", donorContact=" + donorContact
				+ ", donorEmail=" + donorEmail + ", isAnyMedicalhistory=" + isAnyMedicalhistory + ", bloodGroup="
				+ bloodGroup + ", donorWeight=" + donorWeight + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	

}
