package com.example.demo.methodReference;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodreferenceStudent {

	static Predicate<StudentModel> p1 = MethodreferenceStudent :: ageChech;
	static BiPredicate<StudentModel, Integer> p2 =  MethodreferenceStudent :: ageCheckWithParam;
	
	public static void main(String[] args) {
		
		System.out.println("Predicate Age: "+p1.test(StudentsValues.getStudent()));
		System.out.println("BiPredicate Age "+p2.test(StudentsValues.getStudent(), 18));
		MethodreferenceStudent mrs = new MethodreferenceStudent();
		Function<String, String> fun = mrs::printName;
		System.out.println(fun.apply("Arundhas").toUpperCase());
		

	}
	
	static boolean ageChech(StudentModel stum) {
		return stum.getAge() > 18;
	}
		
	static boolean ageCheckWithParam(StudentModel stumm,Integer age) {
		return stumm.getAge() > age;        //Here, we give age in run time
	}
	
	String printName(String name) {
		return "My name is: "+name;
	}

}
