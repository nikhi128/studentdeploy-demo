package com.google.studentapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.studentapp.pojo.Student;
import com.google.studentapp.service.StudentService;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {
	
	
	@Autowired
	StudentService service;
	
	@PostMapping("/insert")
	String insert(@RequestBody Student  student)
	{
		
		
		return service.insertDate(student);
		
	}
	
	@GetMapping("/get")
	List<Student> getStudents()
	{
		
		return service.getAllStudents();
		
	}
	
	@GetMapping("getByid")
	Student getById(@RequestBody  Student student)
	{
		
		return service.getOneStudent(student);
	}
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		return service.deleteId(id);
		
	}
	
	
	@PostMapping("/multi-insert")
	List<Student> multipleInsert(@RequestBody ArrayList<Student> students)
	{
		return service.multiRecordInsert(students);
		
	}
	
	@PutMapping("/update")
	Student  update(@RequestBody Student student)
	{
		
		return service.updateStudent(student);
	}
  
}
