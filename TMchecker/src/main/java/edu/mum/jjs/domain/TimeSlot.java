package edu.mum.jjs.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TIMESLOT")
public class TimeSlot implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "SLOT_ID")
	private Integer slotId;
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	private Date date;
	@Temporal(TemporalType.TIME)
	@Column(name = "START_DATE")
	private Date startDate;
	@Temporal(TemporalType.TIME)
	@Column(name = "END_DATE")
	private Date endDate;
	@ManyToOne
	@JoinColumn(name = "CHECKER_ID")
	private Checker checker;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getSlotId() {
		return slotId;
	}

}
