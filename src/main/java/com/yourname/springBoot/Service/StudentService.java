package com.yourname.springBoot.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yourname.springBoot.Dao.StudentDao;
import com.yourname.springBoot.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	public Collection<Student>getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentByid(int id){
		return this.studentDao.getStudentByid(id);
	}
	public void deleteStusdentById(int id){

		this.studentDao.deleteStusdentById(id);
	}
}
