package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Staff;

@Mapper
public interface StaffMapper {

	@Select("select * from staff")
	List<Staff> findAll();

	@Insert("insert into staff (fullName, katakanaName, password, email) values "
			+ "(#{fullName}, #{katakanaName}, #{password}, #{email})")
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
	void save(Staff staff);

	@Select("select * from staff where id = #{id}")
	Staff findById(Long id);
}
