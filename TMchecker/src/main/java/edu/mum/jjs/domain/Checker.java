package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Checker extends User implements Serializable {
	private static final long serialVersionUID = 5784L;
	@NotEmpty
	@Column(name = "CHECKER_ID")
	private String checkerId;

	public String getCheckerId() {
		return checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}
   User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}
	
}