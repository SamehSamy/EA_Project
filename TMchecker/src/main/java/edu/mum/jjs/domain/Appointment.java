/**
 * 
 */
package edu.mum.jjs.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "APPOINTMENT_ID")
	private String appointId;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	@OneToOne
	@JoinColumn(name = "SLOT_ID")
	private TimeSlot slot; 
	@Enumerated
	@Column(name = "STATUS")
	private Status status;
	public Status getStatus() {
		return status;
	}
	public void setAppointId(String appointId) {
		this.appointId = appointId;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public TimeSlot getSlot() {
		return slot;
	}
	public void setSlot(TimeSlot slot) {
		this.slot = slot;
	}
	public String getAppointId() {
		return appointId;
	}



}
