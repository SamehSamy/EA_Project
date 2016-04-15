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
	
}
