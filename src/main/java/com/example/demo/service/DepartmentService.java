package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentMapper;

@Service
public class DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;
	
	public List<Department> findAll() {
	return departmentMapper.findAll();	
	}
	
	public Department findById(Long Id) {
		return departmentMapper.findById(Id);
	}
}
