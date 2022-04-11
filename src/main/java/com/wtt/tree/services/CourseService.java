package com.wtt.tree.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wtt.tree.pojo.Student;
@Service
public interface CourseService {
	public List<Student> getStudent();
    public Student getsid(int sid);
    public Student addsstream(Student sstream);
    
}
