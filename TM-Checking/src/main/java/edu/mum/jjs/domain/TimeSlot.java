package edu.mum.jjs.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TimeSlot {

	@Id
	private String tId;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date startHour;
	@Temporal(TemporalType.TIME)
	private Date endHour;
	@ManyToOne
	private Checker checker;
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartHour() {
		return startHour;
	}
	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}
	public Date getEndHour() {
		return endHour;
	}
	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}
	public Checker getChecker() {
		return checker;
	}
	public void setChecker(Checker checker) {
		this.checker = checker;
	}
	
}
