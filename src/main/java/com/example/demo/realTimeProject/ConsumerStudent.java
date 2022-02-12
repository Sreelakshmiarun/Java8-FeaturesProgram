package com.example.demo.realTimeProject;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerStudent {
	static Consumer<StudentModel> c1 = (stu) -> System.out.println(stu);
	static Consumer<StudentModel> c2 = (stu) -> System.out.println(stu.getName().toUpperCase());
	static List<StudentModel> list = StudentsValues.getDetails();

	public static void main(String[] args) {

		// list.forEach(c1);
		// list.forEach(c2);

		// list.forEach(c1.andThen(c2));
		print();
	}

	static void print() {
		list.forEach((s) -> {
			if (s.getAge() > 18) {
				c1.andThen(c2).accept(s);
			}

		});

	}

}
