package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetVisitors {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Visitors vst = entityManager.find(Visitors.class, 2);
		if (vst != null) {
			System.out.println("Id:" + vst.getId());
			System.out.println("Name: " + vst.getName());
			System.out.println("email: " + vst.getEmail());
			System.out.println("gender: " + vst.getGender());
			System.out.println("DOB: " + vst.getDob());
			System.out.println("Visting time:" + vst.getVisitDateTime());

			System.out.println("---------------done---------");
		} else {
			System.out.println("no record");
		}
	}

}
