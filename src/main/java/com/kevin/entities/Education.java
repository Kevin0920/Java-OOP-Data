package com.kevin.entities;

import java.util.Date;

public class Education {
	private String institution;
	private Date dateEncrolled;
	private Date dataCompleted;
	private Address address = new Address();
	
	public Education() {
		super();
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public Date getDateEncrolled() {
		return dateEncrolled;
	}

	public void setDateEncrolled(Date enrollDate) {
		this.dateEncrolled = enrollDate;
	}

	public Date getDataCompleted() {
		return dataCompleted;
	}

	public void setDataCompleted(Date dataCompleted) {
		this.dataCompleted = dataCompleted;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
