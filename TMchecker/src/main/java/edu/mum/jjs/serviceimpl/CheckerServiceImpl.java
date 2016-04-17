package edu.mum.jjs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.jjs.repository.AppointmentRepository;
import edu.mum.jjs.service.CheckerService;

@Service
@Transactional
public class CheckerServiceImpl implements CheckerService {

	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public String Reject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Appove() {
     if(appointmentRepository.findByappointId(appointId)().){
    	  
      }
		return null;
	}
	

}
