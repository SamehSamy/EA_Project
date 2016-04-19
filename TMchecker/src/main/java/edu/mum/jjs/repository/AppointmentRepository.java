package edu.mum.jjs.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Student;

	@Repository
	public interface AppointmentRepository extends  JpaRepository<Appointment, String> 
	{
		 Appointment findByAppointId(String appointId);

//		 List<Appointment> findByAppointId(String appointId);

		 List<Appointment> findAll();

		 //List<Appointment> findBy(Checker checker);

//		 List<Appointment> findBy(Checker checker);

	      List<Appointment> findByStudent(Student student);
	      Appointment save(Appointment appointment);
	      //List<Appointment> findByAppointId(String appointId);
		 
		 
		 //List<Appointment> findBystartDate(Date startDate);
		 
//		 commented by Sameh to recover wrong query
//		 @Query("from appointment a JOIN a.TIMESLOT.startDate>CURRENT_DATE")
//		 List<Appointment> findBystartDate(String startDate);
	}

