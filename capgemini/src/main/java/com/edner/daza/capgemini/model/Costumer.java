package com.edner.daza.capgemini.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@Access(AccessType.FIELD)
public class Costumer extends ParentEntity{

	private static final long serialVersionUID = -7992990721130644604L;
	
	@Column(name="name", nullable=false, length=100)
	private String name;
	@Column(name="surname", nullable=false, length=100)
	private String surname;
	@Column(name="customer_id", unique=true, nullable=false, length=15)
	private String customerId;
	@Column(name="email", nullable=false, length=50)
	private String email;
	@Column(name="mobile", nullable=false, length=15)
	private String mobile;
	@Column(name="phone", nullable=false, length=15)
	private String phone;
	@Column(name="password", nullable=false, length=100)
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
