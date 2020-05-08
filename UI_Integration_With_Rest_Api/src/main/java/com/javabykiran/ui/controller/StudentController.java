package com.javabykiran.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiran.ui.model.Student;
import com.javabykiran.ui.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping(value = "/save", headers = "Accept=application/json")
	public ResponseEntity<Void> saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@GetMapping(value = "/{rollNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getUserById(@PathVariable("rollNo") int roll) {
		System.out.println("Fetching User with id " + roll);
		Student user = studentService.studentGetById(roll);
		if (user == null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		} else
			return new ResponseEntity<Student>(user, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllStudent", headers = "Accept=application/json")
	public List<Student> getAllStudent() {
		List<Student> studentList = studentService.getAllStudent();
		return studentList;
	}
}
