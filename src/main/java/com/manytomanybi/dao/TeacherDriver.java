package com.manytomanybi.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.manytomanybi.dto.Student;
import com.manytomanybi.dto.Teacher;

public class TeacherDriver {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Ram");
		teacher.setNumber(84849);
		teacher.setAddress("BTM");

		Teacher teacher1 = new Teacher();
		teacher1.setId(2);
		teacher1.setName("Kartik");
		teacher1.setNumber(757498);
		teacher1.setAddress("Hsr");

		Teacher teacher2 = new Teacher();
		teacher2.setId(3);
		teacher2.setName("Sohail");
		teacher2.setNumber(53465);
		teacher2.setAddress("sena");

		Student student = new Student();
		student.setId(101);
		student.setName("laxmi");
		student.setPhone(75859);
		student.setAddress("bangalore");

		Student student1 = new Student();
		student1.setId(102);
		student1.setName("sonam");
		student1.setPhone(9436);
		student1.setAddress("Patna");

		Student student2 = new Student();
		student2.setId(103);
		student2.setName("Varma");
		student2.setPhone(12345);
		student2.setAddress("Delhi");

		List<Teacher>list = new ArrayList<Teacher>();
		list.add(teacher2);
		list.add(teacher1);
		student.setList(list);

		List<Teacher>list1 = new ArrayList<Teacher>();
		list1.add(teacher);
		list1.add(teacher1);
		student1.setList(list1);

		List<Teacher>list2 = new ArrayList<Teacher>();
		list2.add(teacher2);
		list2.add(teacher1);
		list2.add(teacher);
		student2.setList(list2);

		List<Student> sl= new ArrayList<Student>();
		sl.add(student2);
		sl.add(student1);
		teacher.setStudents(sl);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(teacher);
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);

		entityTransaction.commit();

	}

}

