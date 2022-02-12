package com.example.demo.methodReference;

import java.util.function.Consumer;

public class LambdaLocalVariables {

	static int c = 30;

	public static void main(String[] args) {

		int b = 20;                                        // lambda's consider the local variales as final
		Consumer<Integer> con = a -> {

			System.out.println("a value is: " + (a));
			System.out.println("b value is: " + b);
			// b++;                                     //Showing error as effectivly final,because its local variable
			System.out.println("c value is: " + c);
			int c = 40;
			System.out.println("c value is: " + c);
		};

		con.accept(10);

	}

}
