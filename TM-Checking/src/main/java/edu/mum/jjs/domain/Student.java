package edu.mum.jjs.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private String studentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	

}
