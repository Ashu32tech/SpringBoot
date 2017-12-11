package com.yourname.springBoot.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yourname.springBoot.Entity.Student;
import com.yourname.springBoot.Service.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentController {
	@Autowired
	private StudentService studentService;	
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Student>getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Student getStudentByid(@PathVariable("id") int id){
		return this.studentService.getStudentByid(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteStusdentById(@PathVariable("id") int id){
		this.studentService.deleteStusdentById(id);
		
	}
}
