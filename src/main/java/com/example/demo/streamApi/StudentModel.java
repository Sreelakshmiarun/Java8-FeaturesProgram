package com.example.demo.streamApi;

import java.util.List;
import java.util.Optional;

public class StudentModel {
	
	private int id;
	private String name;
	private String gender;
	private int age;
	
	private List<String> subjects;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public StudentModel(int id, String name, String gender, int age, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subjects = subjects;
	}
	
	
	public StudentModel(StudentModel student) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", subjects="
				+ subjects + "]";
	}

	
	
	
	
	

}
