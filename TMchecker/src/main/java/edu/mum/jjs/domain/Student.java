package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Student extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "STUDENT_ID")
	private String studentId;
	@Column(name = "EMAIL")
	private String email;

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
