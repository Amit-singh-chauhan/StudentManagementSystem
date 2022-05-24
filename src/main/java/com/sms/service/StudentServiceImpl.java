package com.sms.service;
import static java.util.Objects.isNull;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.Repository.StudentRepository;
import com.sms.model.Student;
@Service
public class StudentServiceImpl implements StudentService  {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public void saveOrUpdateStudent(Student student) {
		if (isNull(student.getId())) {
			studentRepository.save(student);

		} else {
			studentRepository.save(student);

		}
	}

	@Override
	public void deleteStudent(String id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Optional<Student> getById(String id) {
		return studentRepository.findById(id);
	}
}