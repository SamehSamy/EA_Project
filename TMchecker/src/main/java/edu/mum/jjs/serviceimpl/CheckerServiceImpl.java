package edu.mum.jjs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jjs.domain.Status;
import edu.mum.jjs.repository.AppointmentRepository;
import edu.mum.jjs.service.CheckerService;

@Service
@Transactional
public class CheckerServiceImpl implements CheckerService {

	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public Status Reject() {
		// TODO Auto-generated method stub
		return Status.APPROVED;
	}

	@Override
	
	public Status Appove() 
	{		
		//appointmentRepository.findBystartDate(("startDate")>= CURRENT_DATE);         	        
		return Status.REJECTED;
	}
	
}
