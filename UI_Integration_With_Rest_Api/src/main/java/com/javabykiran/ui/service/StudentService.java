package com.javabykiran.ui.service;

import java.util.List;

import com.javabykiran.ui.model.Student;

public interface StudentService {
	
	public void saveStudent(Student student);
	public Student studentGetById(int id);
	public List<Student> getAllStudent();

}
