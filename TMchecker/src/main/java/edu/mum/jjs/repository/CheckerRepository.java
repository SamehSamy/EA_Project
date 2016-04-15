package edu.mum.jjs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import edu.mum.jjs.domain.Checker;

 public interface CheckerRepository extends CrudRepository<Checker,Long>  
 {
	 @Query("SELECT a from Appointment WHERE a.slot.startDate >=:CURRENT_DATE")
	 public String  Appove();
   
}
 
