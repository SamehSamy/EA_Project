package edu.mum.jjs.serviceimpl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jjs.domain.TimeSlot;
import edu.mum.jjs.repository.AppointmentRepository;
import edu.mum.jjs.repository.TimeSlotRepository;
import edu.mum.jjs.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private TimeSlotRepository timeSlotRepository;
	@Autowired
	private AppointmentRepository appointmentRepository;
	private TimeSlot selectedSlot ;
	
	@Override
	public void schedualAppointment() {
		// create appoint	
	}
	
	
	public TimeSlot getSelectedSlot() {
		return selectedSlot;
	}


	public void setSelectedSlot(TimeSlot selectedSlot) {
		this.selectedSlot = selectedSlot;
	}


	public List<TimeSlot> retrevieAvailableSlots(){
		return timeSlotRepository.findByStartDateAfter(new Date());
	}

}
