package edu.mum.jjs.domain;

import javax.persistence.Entity;

@Entity
public class Checker {

	private String checkerId;

	public String getCheckerId() {
		return checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
	
}
