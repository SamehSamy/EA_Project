package edu.mum.jjs.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.Student;

	@Repository
	public interface StudentRepository extends  CrudRepository<Student, Long> 
	{
	
		
  
	}

