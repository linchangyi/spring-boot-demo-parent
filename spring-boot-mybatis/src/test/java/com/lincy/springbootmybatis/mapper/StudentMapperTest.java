package com.lincy.springbootmybatis.mapper;

import com.lincy.springbootmybatis.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void queryBySno() {
        Student student = studentMapper.queryBySno("001");
        System.out.println(student.toString());
    }
}