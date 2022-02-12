package com.example.demo.realTimeProject;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateStudent {

	static BiPredicate<Integer, String> heightAndGender = (age, gender) -> age > 30 && gender.equals("female");

	public static void main(String[] args) {

		List<StudentModel> list = StudentsValues.getDetails();
		list.forEach(a -> {
			if (heightAndGender.test(a.getAge(), a.getGender())) {
				System.out.println(a);
			}

		});

	}

}
