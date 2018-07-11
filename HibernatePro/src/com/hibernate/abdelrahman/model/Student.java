package com.hibernate.abdelrahman.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Student")
@Table(name="STUDENTS")
public class Student {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
