package edu.mum.jjs.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.jjs.domain.Student;

public interface SudentRepository extends CrudRepository<Student,String>
{

}
