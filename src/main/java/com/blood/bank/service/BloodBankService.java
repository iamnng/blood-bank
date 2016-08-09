package com.blood.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bank.dao.BloodBankDao;

@Service
public class BloodBankService {
	
	@Autowired
	private BloodBankDao bloodBankDao;
	
	
}
