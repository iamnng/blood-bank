package com.blood.bank.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.blood.bank.dao.BloodBankDao;
import com.blood.bank.entity.Donor;

@Repository
public class BloodBankDaoImpl implements BloodBankDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Donor> getAllDonors() {
		final String ALL_DONORS_SQL = "SELECT * FROM DONOR";
		List<Donor> donorList = jdbcTemplate.query(ALL_DONORS_SQL, new DonorMapper());
		return donorList;
	}

}
