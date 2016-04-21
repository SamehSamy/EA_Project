package edu.mum.jjs.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.Appointment;

    @Repository
    public interface AppointmentRepository extends  JpaRepository<Appointment, Long> 
    
    {
//    	@Query("from Appointment a where a.appointId =:appointId")
//         Appointment findByAppointId(long appointId);

         List<Appointment> findAll();

          Appointment save(Appointment appointment);
     
       

    }