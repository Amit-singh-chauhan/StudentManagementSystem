package com.sms.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sms.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{
	
}

