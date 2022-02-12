package com.example.demo.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("arun","siva","thanaraj","maharaja");
		Stream<String> StreamNames = names.stream().filter(n -> n.length() < 5);
		StreamNames.forEach(System.out::println);
		

	}

}
