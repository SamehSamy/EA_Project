package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Status;
import edu.mum.jjs.domain.Student;
import edu.mum.jjs.domain.TimeSlot;

public interface CheckerService   
 {
	List<Checker> findAllChecker();

	void rejectAppointment(Appointment appointment);

	void approveAppointment(Appointment appointment);
	void penddingndAppointment(Appointment appointment);

	void modifyAppointment(Appointment appointment, String appointId);
		
	List<TimeSlot> getAlltimeSlots();
	

	
	   
}
 
