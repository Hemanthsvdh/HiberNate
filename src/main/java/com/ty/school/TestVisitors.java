package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestVisitors {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Visitors v= new Visitors();
		v.setId(1);
		v.setName("Jerry");
		v.setEmail("teacher@gmail");
		v.setGender('m');
		v.setDob(LocalDate.now());// for user defined date setDob(LocalDate.of(1995,11,22));
		v.setVisitDateTime(LocalDateTime.now());
		
		
		entityTransaction.begin();
		entityManager.persist(v);
		entityTransaction.commit();
		
		System.out.println("---------------done---------");
	
	}


}
