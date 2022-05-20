package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student std = entityManager.find(Student.class, 2);
		if (std != null) {
			System.out.println("Id:" + std.getId());
			System.out.println("Name: " + std.getName());
			System.out.println("percentage: " + std.getPercentage());

			System.out.println("---------------done---------");
		} else {
			System.out.println("no student record");
		}

	}

}
