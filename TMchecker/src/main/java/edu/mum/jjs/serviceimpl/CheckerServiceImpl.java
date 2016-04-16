package edu.mum.jjs.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.service.CheckerService;

@Service
@Transactional
public class CheckerServiceImpl implements CheckerService {

	@Override
	public List<Checker> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Checker> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Checker save(Checker checker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Checker find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
