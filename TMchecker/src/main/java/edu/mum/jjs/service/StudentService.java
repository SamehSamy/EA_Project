package edu.mum.jjs.service;

import java.util.List;

import edu.mum.jjs.domain.Student;
import edu.mum.jjs.domain.TimeSlot;

public interface StudentService {

	public List<TimeSlot> retrevieAvailableSlots();

	void schedualAppointment(Student student, TimeSlot timeSlot);

}
