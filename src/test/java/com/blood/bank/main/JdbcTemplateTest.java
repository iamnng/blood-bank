package com.blood.bank.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blood.bank.dao.BloodBankDao;
import com.blood.bank.entity.Donor;

public class JdbcTemplateTest {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/blood-bank-servlet.xml");
		BloodBankDao bloodBankDao = context.getBean("bloodBankDao", BloodBankDao.class);
		List<Donor> donorList = bloodBankDao.getAllDonors();
		
		for(Donor donor : donorList){
			System.out.println(donor.getDonorName());
		}
	}
}
