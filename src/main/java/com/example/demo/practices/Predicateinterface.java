package com.example.demo.practices;

import java.util.function.Predicate;

public class Predicateinterface {

	public static void main(String[] args) {
		
		Predicate<Integer> GreaterThan = (x) -> x>50;           //It takes one input and it give boolean output
		Predicate<Integer> Lessthan = (x) -> x<50;
		Predicate<Integer> EqualsTo = (x) -> x==50;           
	/*	boolean pre1 = GreaterThan.test(20);
		boolean pre2= Lessthan.test(20);
		boolean pre3= EqualsTo.test(20);
		System.out.println("GreaterThan: "+pre1);
		System.out.println("Lessthan: "+pre2);
		System.out.println("EqualsTo: "+pre3); */
		
		System.out.println("AND: "+GreaterThan.and(Lessthan).test(20)); //here that '20' value assigned to x of GreaterThan and LessThan
		System.out.println("OR: "+GreaterThan.or(Lessthan).test(20));
		System.out.println("EQUALS: "+GreaterThan.and(EqualsTo).test(50));

	}

}
