package com.apk.donationManager.model;

import com.apk.donationManager.entity.Address;

public class DonorModel {

	Integer donorId;

	String donorName;

	String donorContact;

	String donorEmail;

	boolean isAnyMedicalhistory;

	String bloodGroup;

	String donorWeight;

	Address address;

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
		return "DonorModel [donorId=" + donorId + ", donorName=" + donorName + ", donorContact=" + donorContact
				+ ", donorEmail=" + donorEmail + ", isAnyMedicalhistory=" + isAnyMedicalhistory + ", bloodGroup="
				+ bloodGroup + ", donorWeight=" + donorWeight + ", address=" + address + "]";
	}
	
	

}
