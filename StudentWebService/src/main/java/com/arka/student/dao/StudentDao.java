package com.arka.student.dao;

import org.hibernate.Session;

import com.arka.student.exception.DataNotFoundException;
import com.arka.student.model.Student;
import com.arka.student.util.HibernateUtil;

public class StudentDao {

	public void saveStudent(Student std) {
		Session session=(Session) HibernateUtil.getSessionFactory().openSession();
		session.save(std);
		session.beginTransaction().commit();
		session.close();
	}

	public Student getStudentById(int id) {
		Session session=(Session) HibernateUtil.getSessionFactory().openSession();
		Student student=session.get(Student.class, id);
		session.close();
		return student;
	}
	

}
