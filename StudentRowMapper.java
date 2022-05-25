package com.jshsb.sm.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.jshsb.sm.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student=new Student();
		
		
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setMobile(rs.getLong("mobile"));
		student.setCountry(rs.getString("country"));
		return student;
	}

}
