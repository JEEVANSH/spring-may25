package com.jshsb.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.jshsb.sm.api.Student;
import com.jshsb.sm.rowMapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		String sql="select * from student";
		List<Student> listOfStudent= jdbcTemplate.query(sql, new StudentRowMapper());
		return listOfStudent;
	}

}
