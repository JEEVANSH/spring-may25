package com.jshsb.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jshsb.sm.DAO.StudentDAO;
import com.jshsb.sm.api.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		List<Student> studentList= studentDAO.loadStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
		model.addAttribute("students", studentList);
		return "student-list";
		
	}

}
