package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveParent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Parent p= new Parent();
		p.setName("toM");
		p.setPhone(536236);
		p.setEmail("tom@gmail");
		
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
		
		System.out.println("---------------done---------");
	
	}

}
