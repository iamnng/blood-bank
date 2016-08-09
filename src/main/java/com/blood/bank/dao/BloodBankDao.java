package com.blood.bank.dao;

import java.util.List;

import com.blood.bank.entity.Donor;

public interface BloodBankDao {
	
	List<Donor> getAllDonors();
}