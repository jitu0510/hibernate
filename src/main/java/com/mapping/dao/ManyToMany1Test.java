package com.mapping.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manytomany.bean.Courses;
import com.manytomany.bean.Students;

public class ManyToMany1Test {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			
			Students students=new Students();
			students.setStudentName("Jitu");
			students.setStudentId(1);
			
			Students students1=new Students();
			students1.setStudentName("Kumar");
			students1.setStudentId(2);
			
			Students students2=new Students();
			students2.setStudentName("Mandal");
			students2.setStudentId(3);
			
			ArrayList<Students> arrayListStudents = new ArrayList();
			arrayListStudents.add(students);
			arrayListStudents.add(students1);
			arrayListStudents.add(students2);
			
			Courses courses = new Courses();
			courses.setCourseId(10);
			courses.setCourseName("Python");
			courses.setStudents(arrayListStudents);
			
			ArrayList<Students> arrayListStudents1 = new ArrayList();
			arrayListStudents1.add(students1);
			arrayListStudents1.add(students2);
			Courses courses1 = new Courses();
			courses1.setCourseId(11);
			courses1.setCourseName("Java");
			courses1.setStudents(arrayListStudents1);
			
		
			
			
			
			transaction.begin();
			manager.persist(courses);
			manager.persist(courses1);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}