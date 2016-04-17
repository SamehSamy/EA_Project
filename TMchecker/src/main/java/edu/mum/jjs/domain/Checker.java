package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Checker extends User implements Serializable {
	private static final long serialVersionUID = 5784L;
	@Column(name = "CHECKER_ID")
	private String checkerId;
    Status staus; 

	public String getCheckerId() {
		return checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}

	public Status getStaus() {
		return staus;
	}

	public void setStaus(Status staus) {
		this.staus = staus;
	}
	
}