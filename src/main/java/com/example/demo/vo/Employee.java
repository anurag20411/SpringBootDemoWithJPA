package com.example.demo.vo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
private long id;
private String name;
private String age;
private String dept;
private String email;

public Employee() {}

public Employee(long id, String name, String age, String dept, String email) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.dept = dept;
	this.email = email;
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

@Column(name = "first_name", nullable = false)
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Column(name = "age", nullable = false)
public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

@Column(name = "dept_name", nullable = false)
public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

@Column(name = "email", nullable = false)
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + ", email=" + email + "]";
}



}
