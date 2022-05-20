package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Teacher t= new Teacher();
		t.setId(1);
		t.setName("Jerry");
		t.setEmail("teacher@gmail");
		t.setGender('m');
		t.setPhone(75643901);
		
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		
		System.out.println("---------------done---------");
	
	}


}
