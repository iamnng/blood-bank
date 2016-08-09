package com.blood.bank.entity;

public class Donor {
	private String donorName;
	private String donorAddress;
	private String bloodGroup;
	
	public Donor(String donorName, String donorAddress, String bloodGroup) {
		super();
		this.donorName = donorName;
		this.donorAddress = donorAddress;
		this.bloodGroup = bloodGroup;
	}
	
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonorAddress() {
		return donorAddress;
	}
	public void setDonorAddress(String donorAddress) {
		this.donorAddress = donorAddress;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}