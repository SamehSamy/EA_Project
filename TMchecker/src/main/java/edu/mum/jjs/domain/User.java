package edu.mum.jjs.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance
@Table(name = "USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "UID")
	private Integer uid;
	@NotEmpty
	@Column(name = "USER_NAME", nullable = false)
	private String userName;
	@NotEmpty
	@Column(name = "PASS", nullable = false)
	private String password;
	@Column(name = "FIRST_NAME", nullable = false)
	@NotEmpty
	private String firstName;
	@NotEmpty
	@Column(name = "LAST_NAME")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getUid() {
		return uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
