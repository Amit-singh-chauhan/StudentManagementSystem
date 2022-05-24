package com.sms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.model.Student;
import com.sms.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public ResponseEntity<?> getAll() {
		List<Student> result = studentService.findAll();
		return new ResponseEntity(result, HttpStatus.OK);
	}

	@GetMapping(value = "/student")
	public ResponseEntity<?> getById(@RequestParam("id") String id) {
		Optional<Student> result = studentService.getById(id);
		return new ResponseEntity(result, HttpStatus.OK);
	}

	@PostMapping("/student")
	public ResponseEntity<?> addorUpdateExpense(@RequestBody Student student) {
		studentService.saveOrUpdateStudent(student);
		return new ResponseEntity("Student added succcessfully", HttpStatus.OK);
	}

	@PutMapping("/student")
	public ResponseEntity<?> updateStudent(@RequestBody Student student) {
		studentService.saveOrUpdateStudent(student);
		return new ResponseEntity("Student Updated succcessfully", HttpStatus.OK);
	}

	@DeleteMapping("/student")
	public void deleteExpense(@RequestParam("id") String id) {
		studentService.deleteStudent(id);
	}

}