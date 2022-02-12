package com.example.demo.practices;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {         //This interface is same as consumerInterface, but it take 2 arguments,does not return anything...

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> bc = (x,y) -> System.out.println("Addition of number is: "+(x+y));
		BiConsumer<Integer, Integer> bc1 = (x,y) -> System.out.println("Addition of number is: "+(x+y)); 
//        bc.accept(5, 10);		
//        bc1.accept(15, 10);
//		bc.andThen(bc1).accept(10, 20);
		
		List<Integer> l1= Arrays.asList(1,2,3,46,5);
		List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
		
		BiConsumer<List<Integer>, List<Integer>> bi = (list1,list2) -> {
		
			if(list1.size()==list2.size())
			{
				System.out.println("Its same");
			}
			else {
				System.out.println("Its not same");
			}
		};
		
		bi.accept(l1, l2);
		
	}



}
