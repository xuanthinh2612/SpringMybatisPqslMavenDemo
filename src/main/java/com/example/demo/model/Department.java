package com.example.demo.model;

import java.util.List;

public class Department {

	private Long id;

	private String name;

	private List<Department> departments;

	public Department() {
	}

	public Department(Long id, String name, List<Department> departments) {
		super();
		this.id = id;
		this.name = name;
		this.departments = departments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Depertment [id=" + id + ", name=" + name + "]";
	}

}
