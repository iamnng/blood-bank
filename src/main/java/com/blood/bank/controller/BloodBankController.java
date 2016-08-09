package com.blood.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blood.bank.service.BloodBankService;

@Controller
@RequestMapping("/")
public class BloodBankController {

	@Autowired
	private BloodBankService bankService;
	
	/*  URL - http://localhost:8080/blood-bank/home */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomePage(){
		return "index";
	}
	
}
