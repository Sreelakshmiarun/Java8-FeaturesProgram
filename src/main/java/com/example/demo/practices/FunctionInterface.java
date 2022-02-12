package com.example.demo.practices;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
//		Function<String, Integer> a = b -> b.length();
//		Function<String, String> c = b -> b.toUpperCase().toString();
//		Function<String, String> x = b -> b.concat(" Sreelakshmi");
// 		int d = a.apply("mariadhas");
//		System.out.println("total length is: "+d);
//		System.out.println("andThen: "+c.andThen(x).apply("arundhas ")); //here, c.andThen(x) is run the last is x. after that run apply part. 
//	                                                                              //after that run x part..

   Function<String,String> a= b-> b.toUpperCase();
   String c = a.apply("arundhas");
   System.out.println(c);
	
	}                                                                            
	
	

}
