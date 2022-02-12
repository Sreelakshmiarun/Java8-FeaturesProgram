package com.example.demo.streamApi;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StudentsValues {

	public static List<StudentModel> getDetails() {
		StudentModel l1 = new StudentModel(1, "arun", "male", 19,Arrays.asList("tamil","english","maths"));
		StudentModel l2 = new StudentModel(2, "raj", "male", 20,Arrays.asList("maths","chemistry","physics"));
		StudentModel l3 = new StudentModel(3, "siva", "male", 15,Arrays.asList("physics","english","maths"));
		StudentModel l4 = new StudentModel(4, "maha", "male", 26,Arrays.asList("cs","biology","tamil"));
		StudentModel l5 = new StudentModel(5, "nayanthara", "female", 32,Arrays.asList("tamil","zoology","biology"));
		StudentModel l6 = new StudentModel(6, "jeniliya", "female", 35,Arrays.asList("physics","maths","tamil"));
		StudentModel l7 = new StudentModel(7, "rashmika", "female", 26,Arrays.asList("chemistry","maths","cs"));

		return Arrays.asList(l1, l2, l3, l4,l5,l6,l7);

	}
	public static StudentModel getStudent() {
		
		return new StudentModel(1, "arun", "male", 19,Arrays.asList("tamil","english","maths"));
	}
	
//	public static Optional<StudentModel> getStudentOptional() {
//		StudentModel stus = getStudent();                                                       //this part is error....
//		stus.setAddress(Optional.of(new Address("55/1","agasthiyarpuram","tirunelveli")));
//		return Optional.of(stus);
		
	

}
