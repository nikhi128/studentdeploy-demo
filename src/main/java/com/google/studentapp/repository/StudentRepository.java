package com.google.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.studentapp.pojo.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	
}
