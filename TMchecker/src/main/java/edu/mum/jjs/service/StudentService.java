package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.TimeSlot;

public interface StudentService   {
	
	public void schedualAppointment();
	public List<TimeSlot> retrevieAvailableSlots();
	

}
 
