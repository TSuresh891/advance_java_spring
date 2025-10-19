package org.jsp;

import org.springframework.stereotype.Controller;

public class Employee {
	
	private int id;
	private String name;
	private String job;
	private String sal;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, String job, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}
	

}
