package com.example.demo.streamApi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudent2 {

	static Predicate<StudentModel> ageCheck = stu -> stu.getAge() > 18;
	 static Predicate<StudentModel> genderCheck = stu -> stu.getGender().equals("female");
	public static void main(String[] args) {

System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		Map<Integer, String> map = StudentsValues.getDetails()      // Root of data
				.stream()                                                 // Convert the collections to Stream
				.filter(ageCheck.and(genderCheck))  
				//.filter(genderCheck)
				.collect(Collectors.toMap(StudentModel::getId, StudentModel::getName)); // here, We getting the data in
																						// stream type,So 'collect' is
		System.out.println(map);																		// covert or give the data type
																						// as we want,here we select
																						// collectors class for map
																						// purpose

System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	List<String> studentNameGetting =  StudentsValues.getDetails()
			.stream()                            //here, we convert the collections to stream
			.map(StudentModel::getSubjects)      //here, we getting stream<list<subjects>>
			.flatMap(List::stream)                //here,we getting stream<string>
			.distinct()                            //here, distinct is remove the all dublicate data's
			.collect(Collectors.toList());         //here, we convert the stream to list.
	
	System.out.println(studentNameGetting);
			
			

	}

}
