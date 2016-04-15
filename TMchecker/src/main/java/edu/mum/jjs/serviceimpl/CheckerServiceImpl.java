package edu.mum.jjs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.jjs.repository.CheckerRepository;
import edu.mum.jjs.service.CheckerService;

@Service
@Transactional
public class CheckerServiceImpl implements CheckerService {
    
	@Autowired CheckerRepository  checkerRepository;
	
	@Override
	public String Appove() {
		// TODO Auto-generated method stub
		return checkerRepository.Appove();
	}

	@Override
	public String Reject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pendding() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
