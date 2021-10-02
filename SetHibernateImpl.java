package com.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.bean.Employee;

public class SetHibernateImpl {

	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("emp1");
			manager=factory.createEntityManager();
			Employee employee=manager.find(Employee.class, 1);
			System.out.println(employee);
			employee.setDesignation("Developer");
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			
			//System.out.println(employee.getDesignation());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}
		
		

	}

}
