package com.tcs.fitnessappspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Appointment_id;
	private String Name;
	private Long Phone;
	private String Email;
	private Integer Age;
	private String Complete_address;
	private String Trainer_preference;
	private String Physio_required;
	private String Package;
	
	public Integer getAppointment_id() {
		return Appointment_id;
	}
	public void setAppointment_id(Integer appointment_id) {
		Appointment_id = appointment_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getComplete_address() {
		return Complete_address;
	}
	public void setComplete_address(String complete_address) {
		Complete_address = complete_address;
	}
	public String getTrainer_preference() {
		return Trainer_preference;
	}
	public void setTrainer_preference(String trainer_preference) {
		Trainer_preference = trainer_preference;
	}
	public String getPhysio_required() {
		return Physio_required;
	}
	public void setPhysio_required(String physio_required) {
		Physio_required = physio_required;
	}
	public String getPackage() {
		return Package;
	}
	public void setPackage(String package1) {
		Package = package1;
	}
	
	
}
