package com.crud.web;

import com.crud.web.entity.Student;
import com.crud.web.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruDstudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CruDstudentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("joel", "gallardo", "jgm@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("leoj", "odrallag", "mgj@gmail.com");
		studentRepository.save(student2);
		*/

	}
}
