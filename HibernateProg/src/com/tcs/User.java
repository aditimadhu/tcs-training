package com.tcs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	
	@Table(name = "user")
	public class User {

		
		@Column(name = "emp_id")
		@Id// auto generate the value for primary key
		private int id;
		
		@Column(name = "emp_name")
		private String name;
		
		@Column(name = "emp_salary")
		private double salary;
		
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
	}


