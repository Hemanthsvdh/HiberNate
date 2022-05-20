package com.ty.school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetMultipleStudents {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	String sql="SELECT s FROM Student s";
	
	Query query=entityManager.createQuery(sql);
	List<Student>  student=query.getResultList();
	
	for(Student std:student) {
		System.out.println("Id:" + std.getId());
		System.out.println("Name: " + std.getName());
		System.out.println("percentage: " + std.getPercentage());
		
		System.out.println("-------------------------------------");

	}
}
}
