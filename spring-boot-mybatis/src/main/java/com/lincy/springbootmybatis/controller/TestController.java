package com.lincy.springbootmybatis.controller;

import com.lincy.springbootmybatis.domain.Student;
import com.lincy.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping( value = "/queryStudent")
	public Student queryStudentBySno(String sno) {
		return this.studentService.queryStudentBySno(sno);
	}
}
