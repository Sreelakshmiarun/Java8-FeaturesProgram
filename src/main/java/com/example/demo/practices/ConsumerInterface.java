package com.example.demo.practices;

import java.util.function.Consumer;

public class ConsumerInterface { // It takes one arguments,But doesn't return any value.Like, void

	public static void main(String[] args) {

		// In Java 8

		Consumer<String> c1 = (a) -> System.out.println(a.toUpperCase());
		// c1.accept("mariadhas");

		Consumer<String> c2 = (b) -> System.out.println(b.toLowerCase());
		// c2.accept("ARUNDHAS");

		c1.andThen(c2).accept("ARUNDHAS"); // If you using both operations in same datatype and need same obejct, you
											// can perform this type(Default method in consumer Interface).

		Consumer<Integer> c3 = (x) -> System.out.println(x+100);
		//c3.accept(5);
		
		Consumer<Integer> c4 =(y) -> System.out.println(y+10);
		//c4.accept(10);
		
		c3.andThen(c4).accept(10);  //We can't use two different type of datatypes in this operation 
		
		// ---------------------------------------------------------------------------------

		// Before Java 8

//		Consumer<String> c1= new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t.toUpperCase());
//				
//			}
//		};
//		c1.accept("mariadhas");

	}

}
