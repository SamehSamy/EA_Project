package edu.mum.jjs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;

 public interface CheckerRepository extends JpaRepository<Checker,Long>  
 {
	 
   
}
 
