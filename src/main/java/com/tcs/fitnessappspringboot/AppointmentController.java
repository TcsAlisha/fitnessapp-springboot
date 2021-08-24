package com.tcs.fitnessappspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
	@Autowired
	IAppointmentService appointmentservice;
	
	@GetMapping("/getAppointment")
	public String getAppointment() {
		return "Appointments";
	}
	@PostMapping("/appointments")
	public void saveAppointments(@RequestBody Appointment appointment) {
		appointmentservice.save(appointment);
		System.out.println(appointment.getName());
	}
}
