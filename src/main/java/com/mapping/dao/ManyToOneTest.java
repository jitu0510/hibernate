package com.mapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manymapping.bean.Cart;
import com.manymapping.bean.Products;

public class ManyToOneTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Cart cart = new Cart();
		cart.setCartId(1);
		cart.setCartName("cart1");
		
		Products products = new Products();
		products.setPId(100);
		products.setPName("p1");
		products.setCart(cart);
		transaction.begin();
		manager.persist(products);
		transaction.commit();

	}

}
