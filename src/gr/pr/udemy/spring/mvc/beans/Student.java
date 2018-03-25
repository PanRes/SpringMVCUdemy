package gr.pr.udemy.spring.mvc.beans;

import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String sex;
	private List<String> operatingSystems;
	private List<String> devices;
	
	public Student() {
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
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}
	
	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public List<String> getDevices() {
		return devices;
	}
	
	public void setDevices(List<String> devices) {
		this.devices = devices;
	}
	
	@Override
	public String toString() {
		return "Student: " + getFirstName() + " " + getLastName() + " is " + getSex() + ", from " + getCountry() +
				" and their favorite programming language is " + getFavoriteLanguage() + ". The student owns" +getOperatingSystems();
	}
}
