package Lab4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class People {
	String name;
	String phone;
	
	@Autowired //Car가 자동으로 만들어서 들어옴
	Car car;
	
	List<String> major;	 //복수전공
	List<License> licenses;
	
	public People() {}

	public People(String name, String phone, Car car) {
		super();
		this.name = name;
		this.phone = phone;
		this.car = car;
	}

	

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + ", car=" + car + ", major=" + major + ", licenses="
				+ licenses + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Car getCar() {
		return car;
	}

	public List<String> getMajor() {
		return major;
	}

	public void setMajor(List<String> major) {
		this.major = major;
	}

	public List<License> getLicenses() {
		return licenses;
	}
	@Autowired
	public void setLicenses(List<License> licenses) {
		this.licenses = licenses;
	}

	public void setCar(Car car) {
		this.car = car;
	};
	
}
