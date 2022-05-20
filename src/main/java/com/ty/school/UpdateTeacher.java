package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher s = new Teacher();
		s.setId(3);
		s.setName("jack");
		s.setEmail("name@");
		s.setGender('M');
		s.setPhone(987654);

		entityTransaction.begin();
		entityManager.merge(s);
		entityTransaction.commit();

		System.out.println("---------------done---------");
	}

}
