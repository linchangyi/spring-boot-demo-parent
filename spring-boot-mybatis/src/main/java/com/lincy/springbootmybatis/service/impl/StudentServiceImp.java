package com.lincy.springbootmybatis.service.impl;

import com.lincy.springbootmybatis.domain.Student;
import com.lincy.springbootmybatis.mapper.StudentMapper;
import com.lincy.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public int add(Student student) {
		return this.studentMapper.add(student);
	}

	@Override
	public int update(Student student) {
		return this.studentMapper.update(student);
	}

	@Override
	public int deleteBySno(String sno) {
		return this.studentMapper.deleteBysno(sno);
	}

	@Override
	public Student queryStudentBySno(String sno) {
		return this.studentMapper.queryBySno(sno);
	}
}
