package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Checker extends User implements Serializable {
	private static final long serialVersionUID = 5784L;
	@Column(name = "CHECKER_ID")
	private String checkerId;


	public String getCheckerId() {
		return checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
}