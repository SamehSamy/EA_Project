package edu.mum.jjs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Student;
import edu.mum.jjs.repository.AppointmentRepository;
import edu.mum.jjs.service.AppointmentService;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public List<Appointment> getAll() {
		return (List<Appointment>) appointmentRepository.findAll();
	}

	@Override
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);	}

	@Override
	public List<Appointment> getAppointmentByChecker(Checker checker) {		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Appointment> getAppointmentByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void  delete(Appointment appointment) {
		
		appointmentRepository.delete(appointment.getAppointId());
	}

	@Override
	public Appointment getAppointmentById(long appointId) {		
		return (Appointment) appointmentRepository.findOne(appointId);
	}

	@Override
	public Appointment findOne(long id) {
		return appointmentRepository.findOne(id);
	}

}
