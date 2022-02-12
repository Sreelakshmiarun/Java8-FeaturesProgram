package com.example.demo.realTimeProject;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateStudent {

	static Predicate<StudentModel> agePredicate = (pre) -> pre.getAge() > 18;
	static Predicate<StudentModel> genderPredicate = (pre) -> pre.getGender().equals("male");
	static BiPredicate<Integer, String> ageGenderPredicate = (age, gender) -> age > 18 && gender.equals("male");
	static BiConsumer<Integer, String> idNameConsumer = (id, name) -> System.out.println("id: " + id + "name: " + name);

	static Consumer<StudentModel> studentConsumer = (pre) -> {
		// if(agePredicate.and(genderPredicate).test(pre)) {
		if (ageGenderPredicate.test(pre.getAge(), pre.getGender())) {
			idNameConsumer.accept(pre.getId(), pre.getName());
		}

	};

	public static void main(String[] args) {

		List<StudentModel> list = StudentsValues.getDetails();
		list.forEach(studentConsumer);

	}

}
