package com.example.demo.optional;

import java.util.Optional;

public class OtherExamples {

	public static void main(String[] args) {
		
		String[] a= new String[10];
//		String b = a[5].toUpperCase();
//		System.out.println(b);
		
		Optional<String> optionalChecking = Optional.ofNullable(a[5]);
		if( optionalChecking.isPresent()) {
			String word = a[5].toUpperCase();
			System.out.println(word);
		} else {
			System.out.println("Word is NULL");
			
		}

	}

}
