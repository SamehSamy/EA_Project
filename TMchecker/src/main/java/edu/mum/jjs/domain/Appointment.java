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
import javax.persistence.FetchType;
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
	private long appointId;	
	@ManyToOne(cascade = CascadeType.ALL)
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
	public void setAppointId(Integer appointId) {
		this.appointId = appointId;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	public TimeSlot getSlot() {
		return slot;
	}
	public void setSlot(TimeSlot slot) {
		this.slot = slot;
	}
	
	public long getAppointId() {
		return appointId;
	}
	public Student getStudent() {
		return student;
	}
	



}
