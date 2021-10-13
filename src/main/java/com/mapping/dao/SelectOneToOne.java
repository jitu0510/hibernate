package com.mapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mapping.bean.Employee;

public class SelectOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Employee employee = manager.find(Employee.class,1);
		System.out.println(employee.getEName());
		System.out.println(employee.getEId());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getLaptop().getLId());
		System.out.println(employee.getLaptop().getLName());
	}

}
