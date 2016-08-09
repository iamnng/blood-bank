package com.blood.bank.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.blood.bank.entity.Donor;

public class DonorMapper implements RowMapper<Donor>{

	public Donor mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Donor donor = new Donor();
		donor.setDonorName(resultSet.getString("DONOR_NAME"));
		donor.setDonorAddress(resultSet.getString("DONOR_ADDRESS"));
		donor.setBloodGroup(resultSet.getString("BLOOD_GROUP"));
		return donor;
	}

}
