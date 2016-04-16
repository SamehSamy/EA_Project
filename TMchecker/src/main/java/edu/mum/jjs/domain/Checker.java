package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Checker implements Serializable {
	private static final long serialVersionUID = 5784L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String checkerId;

	public Checker() {

	}

	public String getCheckerId() {
		return checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
}