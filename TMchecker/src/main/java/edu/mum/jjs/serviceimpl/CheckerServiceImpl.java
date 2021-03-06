package edu.mum.jjs.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Status;
import edu.mum.jjs.domain.TimeSlot;
import edu.mum.jjs.repository.AppointmentRepository;
import edu.mum.jjs.repository.CheckerRepository;
import edu.mum.jjs.repository.StudentRepository;
import edu.mum.jjs.repository.TimeSlotRepository;
import edu.mum.jjs.service.CheckerService;

@Service
@Transactional
public class CheckerServiceImpl implements CheckerService {
	private Logger logger;
	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	CheckerRepository checkerRepository;
	// @Autowired
	TimeSlotRepository timeSlotRepository;
	// @Autowired
	StudentRepository studentRepository;

	@Override

	public void modifyAppointment(Appointment appointment, long appointId) {
		logger.info("Appointment  modify appointment id: " + appointment.getAppointId());
		Appointment appointmentManaged = appointmentRepository.findOne(appointment.getAppointId());
		if (appointmentManaged != null) {
			logger.info("Modify appointment ok");
		} else
			logger.info("Modify appointment NOT ok");
		
		appointmentRepository.saveAndFlush(appointment);
	}

//	@Override
//	public void rejectAppointment(Appointment appointment) {
//		appointment.setStatus(Status.REJECTED);
//		checkerRepository.delete(appointment);
//	}

	@Override
	public void approveAppointment(Appointment appointment) {
		appointment.setStatus(Status.APPROVED);
		appointmentRepository.delete(appointment);
		appointmentRepository.saveAndFlush(appointment);

	}

	@Override
	public List<Checker> findAllChecker() {
		return checkerRepository.findAll();
	}

	@Override
	public List<Appointment> getAllappointments() {
		return appointmentRepository.findAll();
	}

	@Override
	public Checker save(Checker checker) {
		// TODO Auto-generated method stub
		return (Checker) checkerRepository.save(checker);
	}

	@Override
	public void rejectAppointment(Appointment appointment) {
		appointment.setStatus(Status.REJECTED);
     	//checkerRepository.delete(appointId);;
	}
		
	}


