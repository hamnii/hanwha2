package com.hanwha.mypjt;

import java.sql.Date;

public class MemberDTO {
	
private String name;
private String member_id;
private String password;
private Date birthday;
private String email;
private String address;
private int pet;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMember_id() {
	return member_id;
}
public void setMember_id(String member_id) {
	this.member_id = member_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPet() {
	return pet;
}
public void setPet(int pet) {
	this.pet = pet;
}
@Override
public String toString() {
	return "MemberDTO [name=" + name + ", member_id=" + member_id + ", password=" + password + ", email=" + email
			+ ", address=" + address + ", pet=" + pet + "]";
}



}
