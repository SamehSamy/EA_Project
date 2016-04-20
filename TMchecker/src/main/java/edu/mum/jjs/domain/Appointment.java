/**
 * 
 */
package edu.mum.jjs.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "APPOINTMENT_ID")
	private Integer appointId;
	@Column(name = "Stud_ID")
	private String studentId;
	@Column(name = "Stud_FName")
	private String firstName;	
	@Column(name = "Stud_LName")
	private String lastName;
//	@ManyToOne
//	@JoinColumn(name = "STUDENT_ID")
	//private Student student;
	@OneToOne
	@JoinColumn(name = "SLOT_ID")
	private TimeSlot slot; 
	@Enumerated
	@Column(name = "STATUS")
	private Status status;
	public Status getStatus() {
		return status;
	}
	public void setAppointId(Integer appointId) {
		this.appointId = appointId;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public TimeSlot getSlot() {
		return slot;
	}
	public void setSlot(TimeSlot slot) {
		this.slot = slot;
	}
	
	public Integer getAppointId() {
		return appointId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



}
