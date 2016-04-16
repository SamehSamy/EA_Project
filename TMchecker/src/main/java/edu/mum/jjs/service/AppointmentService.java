package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.Appointment;

 public interface AppointmentService   {
	
	public List<Appointment> getAll();
	
	public Appointment save(Appointment appointment);
	   
}
 
