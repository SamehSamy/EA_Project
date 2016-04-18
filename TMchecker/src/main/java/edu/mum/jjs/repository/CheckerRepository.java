package edu.mum.jjs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;

public interface CheckerRepository extends JpaRepository<Checker, Long>

{

	List<Checker> findAll();

	Checker findByCheckerId(String checkerId);

	Checker findByUserName(String userName);
}
