package com.example.demo.streamApi;

import java.util.stream.Stream;

public class SimpleStreamExample {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(0,1,2,3,4,5); //New Stream  array is created 
		s.forEach(p -> System.out.println(p));
		System.out.println("----------------------------------------------");
        Integer arr[]= new Integer[] {1,2,3,4,5,6,7};
        Stream<Integer> s1 = Stream.of(arr);   //Stream created from existing array
        s1.forEach(q -> System.out.println(q));
	}

}
