package com.example.demo.optional;

import java.util.Optional;

public class OptionalMethodsExamples {

	public static void main(String[] args) {
		
		Optional<String> name = Optional.ofNullable("arundhas");
		System.out.println(name.isPresent() ? name.get() : Optional.empty());
		
		             
		Optional<String> name1 = Optional.of("mariadhas");      //here, of method we should only give in not null places
		//Optional<String> name1 = Optional.of(null);           //In case you give of method in null place, it throws the null pointer exception
		System.out.println(name1.isPresent() ? name1.get() : Optional.empty());
		
		System.out.println(Optional.empty());  //here, we print the optional  empty, but we can't see any message because its empty. 

	}

}
