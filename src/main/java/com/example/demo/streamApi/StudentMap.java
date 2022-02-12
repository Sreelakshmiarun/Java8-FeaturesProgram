package com.example.demo.streamApi;

import java.util.List;
import java.util.stream.Collectors;                  
import java.util.stream.Stream;

public class StudentMap {

	public static void main(String[] args) {
	
//---------------------------------------------Geting Student name in UpperCase------------------------------------------------------//		
		
		List<StudentModel> stu = StudentsValues.getDetails();
		List<String> stuStream = stu.stream()        //convert the collections to Stream
				.map(StudentModel::getName)          //Getting name as Stream       
				.map(String :: toUpperCase)           //here, we convert the names into uppercase
				.collect(Collectors.toList());        //here, we convert the stream to list
		
		System.out.println("Students Name in UpperCase: "+ stuStream);
		
				

	}

}
