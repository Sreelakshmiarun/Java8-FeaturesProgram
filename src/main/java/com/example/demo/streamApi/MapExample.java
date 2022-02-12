package com.example.demo.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
	
		List<String> fruits = Arrays.asList("Banana","Apple","Orange","Jack fruit");
		
		List<Integer> intFruits = fruits.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		System.out.println("Length of fruits is: "+ intFruits);
				

	}

}
