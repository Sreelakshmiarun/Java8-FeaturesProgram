package com.example.demo.streamApi;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamStudent {

	static Predicate<StudentModel> ageCheck = stu -> stu.getAge() > 18;
	static Predicate<StudentModel> genderCheck = stu -> stu.getGender().equals("female");
	public static void main(String[] args) {

		Map<Integer, String> map = StudentsValues.getDetails()      // Getting values from class
				.stream()                                                 // Convert the collections to Stream
				.filter(ageCheck.and(genderCheck))  
				//.filter(genderCheck)
				.collect(Collectors.toMap(StudentModel::getId, StudentModel::getName)); // here, We getting the data in
																						// map type,So 'collect' is
																						// covert or give the data type
																						// as we want,here we select
																						// collectors class for map
																						// purpose

		System.out.println(map);

	}

}
