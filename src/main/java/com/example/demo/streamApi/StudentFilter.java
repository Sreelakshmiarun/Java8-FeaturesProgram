package com.example.demo.streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentFilter {

	public static void main(String[] args) {
		
		List<StudentModel> stus = StudentsValues.getDetails();
		List<StudentModel>stuu = stus.stream()
		.filter(s -> s.getAge() > 20)
		.filter(s -> s.getGender().equals("female"))
		.collect(Collectors.toList());
		stuu.forEach(System.out::println);
	}

}
