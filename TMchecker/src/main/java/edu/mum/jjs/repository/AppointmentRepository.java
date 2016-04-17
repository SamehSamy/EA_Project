package edu.mum.jjs.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.Appointment;

	@Repository
	public interface AppointmentRepository extends  CrudRepository<Appointment, Long> 
	{
		List<Appointment> findByappointId(String appointId);
  
	}

