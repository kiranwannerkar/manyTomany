package com.manytomanybi.dto;

	import java.util.List;

import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;

	@Entity
	public class Teacher {
				
			@Id
			private int id;
			private String name;
			private String address;
			private long number;
			
			@ManyToMany
			private List<Student> students;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public long getNumber() {
				return number;
			}

			public void setNumber(long number) {
				this.number = number;
			}

			public List<Student> getStudents() {
				return students;
			}

			public void setStudents(List<Student> students) {
				this.students = students;
			}

	}
	
