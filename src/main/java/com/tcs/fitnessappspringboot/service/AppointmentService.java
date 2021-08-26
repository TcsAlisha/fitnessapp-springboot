package com.tcs.fitnessappspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.fitnessappspringboot.entity.Appointment;
import com.tcs.fitnessappspringboot.repository.IAppointmentRepository;

@Service
public class AppointmentService implements IAppointmentService{
	@Autowired
	IAppointmentRepository appointmentRepository;
	
	@Override
	public void save(Appointment appointment) {
		appointmentRepository.save(appointment);
		System.out.println("Saved appointment");
	}
}
