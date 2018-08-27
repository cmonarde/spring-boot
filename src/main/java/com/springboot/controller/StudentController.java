package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.model.Student;

@Controller
public class StudentController {
	@RequestMapping(method = RequestMethod.POST, value="/register/student")
	@ResponseBody
	Student registerStudent(@RequestBody Student student) {
		student.setRegistrationNumber("12345678");
		student.setRegistrationStatus("Successful");
		return student;
	}
}
