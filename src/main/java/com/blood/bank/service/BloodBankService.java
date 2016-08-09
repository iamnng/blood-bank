package com.blood.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bank.dao.BloodBankDao;
import com.blood.bank.entity.Donor;

@Service
public class BloodBankService {
	
	@Autowired
	private BloodBankDao bloodBankDao;
	
	public List<Donor> getAllDonors() {
		return bloodBankDao.getAllDonors();
	}
}