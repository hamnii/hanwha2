package com.hanwha.mypjt;

public class HospitalDTO {

	
	private String hospital_name;
	private String hospital_address;
	private String phone;
	private String business_hour;
	private String etc;
	
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getHospital_address() {
		return hospital_address;
	}
	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBusiness_hour() {
		return business_hour;
	}
	public void setBusiness_hour(String business_hour) {
		this.business_hour = business_hour;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	@Override
	public String toString() {
		return "HospitalDTO [hospital_name=" + hospital_name + ", hospital_address=" + hospital_address + ", phone="
				+ phone + ", business_hour=" + business_hour + ", etc=" + etc + "]";
	}
	
	
}
