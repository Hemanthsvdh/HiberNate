package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher t = entityManager.find(Teacher.class, 1);// fetchs the data from dataBase
		if (t != null) {
			System.out.println("Id:" + t.getId());
			System.out.println("Name: " + t.getName());
			System.out.println("email: " + t.getEmail());
			System.out.println("gender: " + t.getGender());
			System.out.println("phone: " + t.getPhone());

			System.out.println("---------------done---------");
		} else {
			System.out.println("no record");
		}
	}
}
