package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Staff {

	private Long id;

	@NotEmpty(message = "name can not be emty")
	@Size(max = 100, message = "name size maximum is 100")
	private String fullName;

	@NotEmpty(message = "kata name can not be empty")
	@Size(max = 50, message = "maximum saize is 50")
	private String katakanaName;

	@Email(message = "your email is not correct type")
	@NotEmpty(message = "email can not be emty")
	private String email;

	@NotEmpty(message = "password can not be emty")
	@Size(min = 6,max = 12, message = "password must be between 6 and 12")
	private String password;

	public Staff() {
	}

	public Staff(String fullName, String katakanaName, String email, String password) {
		this.fullName = fullName;
		this.katakanaName = katakanaName;
		this.email = email;
		this.password = password;
	}

	public Staff(Long id,
			@NotEmpty(message = "name can not be emty") @Size(max = 100, message = "name size maximum is 100") String fullName,
			@NotEmpty(message = "kata name can not be empty") @Size(max = 50, message = "maximum saize is 50") String katakanaName,
			@Email(message = "your email is not correct type") @NotEmpty(message = "email can not be emty") String email,
			@NotEmpty(message = "password can not be emty") @Size(min = 6, max = 12, message = "password must be between 6 and 12") String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.katakanaName = katakanaName;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getKatakanaName() {
		return katakanaName;
	}

	public void setKatakanaName(String katakanaName) {
		this.katakanaName = katakanaName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", fullName=" + fullName + ", katakanaName=" + katakanaName + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	

}
