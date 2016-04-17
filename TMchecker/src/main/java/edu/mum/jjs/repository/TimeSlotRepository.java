package edu.mum.jjs.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.jjs.domain.TimeSlot;

	@Repository
	public interface TimeSlotRepository extends  JpaRepository<TimeSlot, Long> 
	{
		public List<TimeSlot> findByStartDateAfter(Date currentDate);
  
	}

