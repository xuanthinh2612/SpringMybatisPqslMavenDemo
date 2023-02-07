package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Staff;

@Mapper
public interface StaffMapper {

	@Select("select * from staff ORDER BY id desc")
	List<Staff> findAll();

	@Insert("insert into staff (fullName, katakanaName, password, email) values "
			+ "(#{fullName}, #{katakanaName}, #{password}, #{email})")
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
	void save(Staff staff);

	@Select("select * from staff where id = #{id}")
	Staff findById(Long id);
	
	@Update("update staff set fullName = #{fullName},katakanaName = #{katakanaName},"
			+ " email = #{email}, password = #{password} where id = #{id}  ")
	void update(Staff staff);
	
	@Delete("delete from staff where id = #{id}")
	void delete(Long id);
}
