package edu.mum.jjs.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.Appointment;

	@Repository
	public interface AppointmentRepository extends  JpaRepository<Appointment, Long> 
	{
		 List<Appointment> findByappointId(String appointId);
		 //List<Appointment> findBystartDate(Date startDate);
		 
//		 commented by Sameh to recover wrong query
//		 @Query("from appointment a JOIN a.TIMESLOT.startDate>CURRENT_DATE")
//		 List<Appointment> findBystartDate(String startDate);
	}

