package com.example.Application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	
	@Column (name ="first_name")
	private String firstName;
	

	@Column (name ="last_name")
	private String lastName;
	

	@Column (name ="occupation")
	private String occupation;
	

	@Column (name ="service_charge")
	private String serviceCharge;
	
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String firstName, String lastName, String occupation, String serviceCharge) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.serviceCharge = serviceCharge;
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getServiceCharge() {
		return serviceCharge;
	}


	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}



}
