package com.javabykiran.ui.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.ui.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void saveStudent(Student student) {
		Session session = sf.getCurrentSession();
		session.save(student);
	}

	@Override
	public Student studentGetById(int id) {
		Session session = sf.getCurrentSession();
		Student student = session.get(Student.class, id);
		return student;

	}

	@Override
	public List<Student> getAllStudent() {
	Session session=	sf.getCurrentSession();
	@SuppressWarnings("unchecked")
	List<Student>studentList=session.createCriteria(Student.class).list();
		return studentList;
	}

}
