package com.yourname.springBoot.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yourname.springBoot.Entity.Student;

@Repository
public class StudentDao {

	private static Map<Integer,Student> students;
	static{
		students=new HashMap<Integer,Student>(){
			{
			put(1,new Student(1,"ashutosh","cs"));
			put(2,new Student(2,"rahul","it"));
			put(3,new Student(3,"matta","gp"));
			}
		};
	}
	
	public Collection<Student>getAllStudents(){
		return this.students.values();
	}
	
	public Student getStudentByid(int id){
		return this.students.get(id);
	}
	
	public void deleteStusdentById(int id){
		this.students.remove(id);
	}
}
