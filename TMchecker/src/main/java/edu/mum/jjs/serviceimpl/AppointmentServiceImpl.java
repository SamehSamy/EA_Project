package edu.mum.jjs.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.service.AppointmentService;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Override
	public List<Appointment> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment save(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
