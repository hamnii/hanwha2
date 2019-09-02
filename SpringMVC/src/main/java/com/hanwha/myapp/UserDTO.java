package com.hanwha.myapp;

public class UserDTO {
	Integer userid;
	String username;
	
	
	//getter Setter는 필수적으로 만들어줘야함 
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "userDTO [userid=" + userid + ", username=" + username + "]";
	}
	
	
	
	
	
}
