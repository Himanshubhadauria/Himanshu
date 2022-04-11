package com.wtt.tree.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wtt.tree.Repo.StudentRepo;
import com.wtt.tree.pojo.Student;
import com.wtt.tree.services.CourseService;

@RestController
public class ContollerPrg {
	@Autowired
	private CourseService cs;
	
	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/home")
	public String home()
	{
	
	return "WelCome";
	}
	@GetMapping("/student")
	public List<Student> getStudent() {
		return this.cs.getStudent();
		
	}
	@GetMapping("/student/{sid}")
	public Student getStudent(@PathVariable String sid)
	{
		return this.cs.getsid(Integer.parseInt(sid));
	}
	
	@PostMapping("/saveEmployee")
	public Student addsstream(@RequestBody Student course)
	{
		return studentRepo.save(course);
	}
}
