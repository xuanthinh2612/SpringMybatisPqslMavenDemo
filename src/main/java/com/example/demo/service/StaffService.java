package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Staff;
import com.example.demo.repository.StaffMapper;

@Service
public class StaffService {

	@Autowired
	StaffMapper staffMapper;

	@Transactional
	public List<Staff> findAll() {
		return staffMapper.findAll();
	}
	
	@Transactional
	public void save(Staff staff) {
		staffMapper.save(staff);
	}
	
	@Transactional
	public Staff findById(Long id) {
		return staffMapper.findById(id);
	}
	
	@Transactional
	public void update(Staff staff) {
		staffMapper.update(staff);
	}
	
	@Transactional
	public void delete(Long id) {
		staffMapper.delete(id);
	}
}
