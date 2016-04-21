package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.TimeSlot;

public interface CheckerService   
 {
	List<Checker> findAllChecker();

	void rejectAppointment(Appointment appointment);

	void approveAppointment(Appointment appointment);

	List<Appointment> getAllappointments();

	Checker save(Checker checker);

	void modifyAppointment(Appointment appointment, long appointId);
	
	   
}
 
