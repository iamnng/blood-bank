package com.blood.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blood.bank.entity.Donor;
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
	
	/*  URL - http://localhost:8080/blood-bank/welcome */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomePage(ModelMap model){
		List<Donor> donorList = bankService.getAllDonors();
		model.addAttribute("donorList", donorList);
		return "welcome";
	}
	
}
