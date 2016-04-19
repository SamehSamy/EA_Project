package edu.mum.jjs.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Status;
import edu.mum.jjs.domain.Student;
import edu.mum.jjs.domain.TimeSlot;
import edu.mum.jjs.repository.AppointmentRepository;
import edu.mum.jjs.repository.StudentRepository;
import edu.mum.jjs.repository.TimeSlotRepository;
import edu.mum.jjs.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private TimeSlotRepository timeSlotRepository;
	@Autowired
	private AppointmentRepository appointmentRepository;
    @Autowired
    private StudentRepository studentRepository;
	@Override
	public void schedualAppointment(Student student, TimeSlot timeSlot) {
		// create an appointment
		Appointment app = new Appointment();
		app.setSlot(timeSlot);
		app.setStatus(Status.PENDDING);
		app.setStudent(student);
		appointmentRepository.saveAndFlush(app);
	}

	@Override
	public List<TimeSlot> retrevieAvailableSlots() {
		return timeSlotRepository.findByStartDateAfter(new Date());
	}

  @Override
  public void save(Student student) {
    // TODO Auto-generated method stub
      studentRepository.save(student);
  }

}
