package com.lincy.springbootmybatis.service;

import com.lincy.springbootmybatis.domain.Student;

public interface StudentService {
	int add(Student student);
    int update(Student student);
    int deleteBySno(String sno);
    Student queryStudentBySno(String sno);
}
