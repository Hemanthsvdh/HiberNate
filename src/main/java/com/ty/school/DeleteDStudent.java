package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student s = entityManager.find(Student.class, 1);
		if (s != null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();

			System.out.println("---------------done---------");
		} else {
			System.out.println("no record to delete");
		}
	}

}
