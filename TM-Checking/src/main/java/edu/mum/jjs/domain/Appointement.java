package edu.mum.jjs.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Appointement {

	@Id
	private String aId;
	@ManyToOne
	private Student sudent;
	@OneToOne
	private TimeSlot slot;
}
