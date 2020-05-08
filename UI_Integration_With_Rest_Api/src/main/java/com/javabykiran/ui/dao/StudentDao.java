package com.javabykiran.ui.dao;

import java.util.List;

import com.javabykiran.ui.model.Student;

public interface StudentDao {
	public void saveStudent(Student student);

	public Student studentGetById(int id);

	public List<Student> getAllStudent();

}
