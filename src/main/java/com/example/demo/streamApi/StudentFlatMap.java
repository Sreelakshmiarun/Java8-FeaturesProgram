package com.example.demo.streamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentFlatMap {

	public static void main(String[] args) {

		List<StudentModel> studs = StudentsValues.getDetails();
 // -------------------------------------------Get Student Subjects--------------------------------------------------------------------//

		List<String> stuStream = studs.stream() // here, we convert the collections to streams
				.map(StudentModel::getSubjects) // here, we get the subjects from studentModel and retruns list of
												// streams
				.flatMap(List::stream) // we taking streams from lsit
				.sorted()
				.distinct() // avoid dublicate subjects
				.collect(Collectors.toList()); // convert the streams to list

		System.out.println("Getting Subjects from students in Single String: " + stuStream);

//--------------------------- --------------Get number of subjects --------------------------------------------------------------------//

		long stuiStream = studs.stream().map(StudentModel::getSubjects)

				.flatMap(List::stream)
				// .collect(Collectors.toList());
				.distinct()
				.count();

		System.out.println("Getting number of subjects: " + stuiStream);

	}

}
