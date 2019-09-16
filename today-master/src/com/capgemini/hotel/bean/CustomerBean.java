package com.capgemini.hotel.bean;

public class CustomerBean {
 private int customerId;
 private String name;
 private String mobileNo;
 private String address;
 private String email;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public CustomerBean(int customerId, String name, String mobileNo, String address, String email) {
	
	this.customerId = customerId;
	this.name = name;
	this.mobileNo = mobileNo;
	this.address = address;
	this.email = email;
}
}
