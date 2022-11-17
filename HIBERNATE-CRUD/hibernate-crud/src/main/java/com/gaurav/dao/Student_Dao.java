package com.gaurav.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaurav.model.Student;
import com.gaurav.util.HibernateUtil;

public class Student_Dao {

	public void saveStudent(Student student) {
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transaction=session.beginTransaction();
			
			transaction.commit();
		}
		catch(Exception e){
			if(transaction!=null) {
				transaction.rollback();
			}
			
		}
	}
	public void UpdateStudent(Student student) {
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		       transaction=session.beginTransaction();
		       session.saveOrUpdate(student);
		       transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null)
			transaction.rollback();
		}
	}
	public Student getStudentbyId(long id) {
		Transaction transaction=null;
		Student student=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		       transaction=session.beginTransaction();
		      student= session.get(Student.class, id);
		       transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null)
			transaction.rollback();
		}
		return student;
	}
	@SuppressWarnings("unchecked")
	public List<Student> getStudents(long id) {
		Transaction transaction=null;
		List<Student> student=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		       transaction=session.beginTransaction();
		       student =session.createQuery("from Student").list();
		       transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null)
			transaction.rollback();
		}
		return student;
	}
	public void deleteStudent(long id) {
		Student student=null;
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
		       transaction=session.beginTransaction();
		       student=session.get(Student.class, id);
		       session.delete(student);
		       transaction.commit();
		}
		catch(Exception e) {
			if(transaction!=null)
			transaction.rollback();
		}
	}
	
	
}
