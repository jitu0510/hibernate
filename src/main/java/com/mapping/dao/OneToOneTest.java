package com.mapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mapping.bean.Employee;
import com.mapping.bean.Laptop;

public class OneToOneTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		Employee employee = new Employee();
		employee.setEName("Jitu");
		employee.setDesignation("ASE");
		employee.setEId(4);
		Laptop laptop = new Laptop();
		employee.setLaptop(laptop);
		
		
		laptop.setLId(300);
		laptop.setLName("HP");
		laptop.setEmployee(employee);
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}

}
