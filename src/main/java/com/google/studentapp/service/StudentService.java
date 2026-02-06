package com.google.studentapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.studentapp.pojo.Student;
import com.google.studentapp.repository.StudentRepository;

@Service
public class StudentService {
	
	
	@Autowired
	StudentRepository repo;

	public String insertDate(Student student) {
		
		repo.save(student);
		
		return "inserted";
	}

	public List<Student> getAllStudents() {
		
		
		return repo.findAll();
	}

	public String deleteId(int id) {
		
		repo.deleteById(id);
		
		return "deteted";
	}

	public List<Student> multiRecordInsert(ArrayList<Student> students) {
		
		return repo.saveAll(students);
	}

	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}

	public Student getOneStudent(Student student) {
		// TODO Auto-generated method stub
		return  repo.getById(null);
	}

}
