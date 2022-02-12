package com.example.demo.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {

	public static void main(String[] args) {
		
		List<Integer> oddNumber = Arrays.asList(1,3,5,7,9);
		List<Integer> evenNumber = Arrays.asList(2,4,6,8,10);
		
		List<List<Integer>> listOfList = Arrays.asList(oddNumber,evenNumber);
		System.out.println("Before Flatten: "+ listOfList);
		
		
		List<Integer> numberStream = listOfList.stream()      //here, we convert the list into streams and its give the list of streams to next process
				.flatMap(List::stream)       //convert the both list as one list and we take streams in list..... 
				.collect(Collectors.toList());    //convert the stream to list
		
		System.out.println("After Flatten: "+numberStream);
				

	}

}
