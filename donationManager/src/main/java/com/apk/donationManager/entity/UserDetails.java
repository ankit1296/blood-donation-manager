package com.apk.donationManager.entity;

import javax.annotation.Generated;
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
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@Column(name="user_details_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userDetailId;
	
	@Column
	String firstName;
	
	@Column
	String lastName;
	
	@Column
	String phoneNo;
	
	@Column
	String emailId;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userDetails")
	Address address;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user;
	
	
	

	public UserDetails () {
		
	}

	public UserDetails(int userDetailId, String firstName, String lastName, String phoneNo, String emailId,
			Address address) {
		super();
		this.userDetailId = userDetailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.address = address;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public int getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(int userDetailId) {
		this.userDetailId = userDetailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDetails [userDetailId=" + userDetailId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", address=" + address + "]";
	}
	
	
	

}
