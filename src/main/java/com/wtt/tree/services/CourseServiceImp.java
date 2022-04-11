package com.wtt.tree.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.wtt.tree.pojo.Student;
@Service
public class CourseServiceImp  implements CourseService{


	
	List<Student> list;

	public CourseServiceImp() {
		list=new ArrayList<>();
		list.add(new Student(111,"Java core","Begineers book"));
		list.add(new Student(112,"Spring core","Begineers Spring "));
	}
	@Override
	public List<Student> getStudent() {
		
				
		return list;
	}

	@Override
	public Student getsid(int sid) {
	Student c=null;
		for(Student student:list)
		{
			if(student.getSid()==sid)
			{
				c=student;
				break;
			}
		}
		return c;
	}
	@Override
	public Student addsstream(Student sstream) {
		
		 
			list.add(sstream);
			return sstream;
		}
	}
	


