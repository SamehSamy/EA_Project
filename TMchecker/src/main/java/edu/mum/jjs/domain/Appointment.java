/**
 * 
 */
package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String aId;
	@ManyToOne
	private Student sudent;
	@OneToOne
	private TimeSlot slot;

	public Appointment() {

	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public Student getSudent() {
		return sudent;
	}

	public void setSudent(Student sudent) {
		this.sudent = sudent;
	}

	public TimeSlot getSlot() {
		return slot;
	}

	public void setSlot(TimeSlot slot) {
		this.slot = slot;
	}

}
