package com.example.demo.practices;

import java.util.Comparator;

public class ComparatorClass {

	public static void main(String[] args) {
		
//		Comparator<Integer> arun = new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer x, Integer y) {
//				
//				return x.compareTo(y);
//			}
//		};
//		System.out.println("beforeJava:"+arun.compare(10, 20));
//	
		
		Comparator<Integer> arun = ( x, y) -> x.compareTo(y) ;
				
				System.out.println(arun.compare(16, 15));
		
		
		}
		
	}


