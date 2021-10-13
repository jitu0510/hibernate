package com.mapping.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manymapping.bean.Cart;
import com.manymapping.bean.Products;

public class OneToManyTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("map");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			
			Cart cart = new Cart();
			cart.setCartId(2);
			cart.setCartName("cart2");
			
			Products product1 = new Products();
			product1.setPId(200);
			product1.setPName("Phone");
			product1.setCart(cart);
			
			Products product2 = new Products();
			product2.setPId(300);
			product2.setPName("Smart Phone");
			product2.setCart(cart);
			
			ArrayList<Products> arrayList = new ArrayList();
			arrayList.add(product1);
			arrayList.add(product2);
			
			
			cart.setProducts(arrayList);
			
			transaction.begin();
			manager.persist(cart);
			transaction.commit();
			
			
			
		} catch (Exception e) {
			
		}

	}

}
