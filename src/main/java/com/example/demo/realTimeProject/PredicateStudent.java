package com.example.demo.realTimeProject;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudent {
	
	static Predicate<StudentModel> agePredicate = pre -> pre.getAge() > 18;
	static Predicate<StudentModel> genderPredicate =pre -> pre.getGender().equals("female");

	public static void main(String[] args) {
		
		List<StudentModel> list = StudentsValues.getDetails();
		
		list.forEach(pre -> {
			
			if(agePredicate.and(genderPredicate).test(pre)) {
				
				System.out.println(pre);
			}
		});
		

	}

}
