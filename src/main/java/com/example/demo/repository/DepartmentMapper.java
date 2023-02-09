package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Department;

@Mapper
public interface DepartmentMapper {

	@Select("select * from department")
	List<Department> findAll();
	
	@Select("select * from department where id=#{id}")
	Department findById(Long id);
}
