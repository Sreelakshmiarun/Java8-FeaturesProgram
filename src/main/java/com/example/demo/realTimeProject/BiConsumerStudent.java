package com.example.demo.realTimeProject;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerStudent {

	static List<StudentModel> list = StudentsValues.getDetails();
	static BiConsumer<Integer, String> bic = (id, name) -> System.out.println("Id: " + id + " " + "Name: " + name);

	public static void main(String[] args) {

		fetch();
	}

	static void fetch()
	{
		list.forEach(a ->
		{
			bic.accept(a.getAge(), a.getName());
		});
	}
}
