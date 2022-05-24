package com.sms.service;

import java.util.List;
import java.util.Optional;

import com.sms.model.Student;

public interface StudentService {
List<Student> findAll();
	
	Optional<Student> getById(String id);
	
	void saveOrUpdateStudent(Student student);
	
	void deleteStudent(String id);
}
