package com.example.demo.methodReference;


import java.util.Arrays;
import java.util.List;

public class StudentsValues {

	public static List<StudentModel> getDetails() {
		StudentModel l1 = new StudentModel(1, "arun", "male", 19);
		StudentModel l2 = new StudentModel(2, "raj", "male", 20);
		StudentModel l3 = new StudentModel(3, "siva", "male", 15);
		StudentModel l4 = new StudentModel(4, "maha", "male", 26);
		StudentModel l5 = new StudentModel(5, "nayanthara", "female", 32);
		StudentModel l6 = new StudentModel(6, "jeniliya", "female", 35);
		StudentModel l7 = new StudentModel(7, "rashmika", "female", 26);

		return Arrays.asList(l1, l2, l3, l4,l5,l6,l7);

	}
	public static StudentModel getStudent() {
		
		return new StudentModel(1, "arun", "male", 19);
	}

}
