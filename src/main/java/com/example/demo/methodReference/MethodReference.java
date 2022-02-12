package com.example.demo.methodReference;

import java.util.Comparator;

public class MethodReference {

	public static void main(String[] args) {
		
		//Before Java8
		System.out.println("Before JAVA8: "+MethodReference.add(20, 10));
		
		Comparator<Integer> com = MethodReference::add;
		System.out.println("MethodReference in JAVA8: "+com.compare(20, 10));
		
		Comparator<Integer> com1 = (x,y) -> add(x,y);
		System.out.println("Lambda in JAVA8: "+ com1.compare(20, 10));
		
	}
	


	static int add(Integer x,Integer y)
	{
		return Integer.compare(x, y);
	}

}
