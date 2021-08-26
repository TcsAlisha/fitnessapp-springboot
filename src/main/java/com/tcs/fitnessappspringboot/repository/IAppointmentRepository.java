package com.tcs.fitnessappspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.fitnessappspringboot.entity.Appointment;

public interface IAppointmentRepository extends CrudRepository<Appointment, Integer>{

}
