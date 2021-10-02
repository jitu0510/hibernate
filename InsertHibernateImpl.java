package com.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.bean.Employee;

public class InsertHibernateImpl {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(4);
		employee.setName("Kumar");
		employee.setSalary(25000);
		employee.setDesignation("Software Developer");
		Employee employee1=new Employee();
		employee1.setId(5);
		employee1.setName("Kumar");
		employee1.setSalary(25000);
		employee1.setDesignation("Software Developer");
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("emp1");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			manager.persist(employee1);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}finally {
			if(factory!=null)
				factory.close();
			if(manager!=null)
				manager.close();
		}

	}

}
