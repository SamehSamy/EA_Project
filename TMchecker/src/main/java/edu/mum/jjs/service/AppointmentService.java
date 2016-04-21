package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Student;

public interface AppointmentService {

	public List<Appointment> getAll();

	public Appointment save(Appointment appointment);

	List<Appointment> getAppointmentByChecker(Checker checker);

	List<Appointment> getAppointmentByStudent(Student student);	

	public void delete(Appointment appointment );
	
	 Appointment  getAppointmentById(long appointId);
	public Appointment findOne(long id); 

	

}
