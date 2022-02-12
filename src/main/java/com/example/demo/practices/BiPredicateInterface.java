package com.example.demo.practices;

import java.util.function.BiPredicate;

public class BiPredicateInterface {

	public static void main(String[] args) {
	
		BiPredicate<Integer, Integer> bip = (a,b) -> a>50 || b<40;
		boolean boo =bip.test(70, 20);
		System.out.println(boo);

	}

}
