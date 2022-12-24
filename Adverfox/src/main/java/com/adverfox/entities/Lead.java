package com.adverfox.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstName", length=45 , nullable=true)
	private String firstName;
	
	@Column(name="lastName", length=45 ,nullable=false )
	private String lastName;
	
	@Column(name ="email" ,length= 100, nullable=false, unique = true )
	private String email;
	
	@Column(name="mobile", nullable=false, unique=true)
	private long mobile;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	

}
