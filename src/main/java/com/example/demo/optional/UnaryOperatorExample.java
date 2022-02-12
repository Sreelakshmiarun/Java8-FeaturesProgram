package com.example.demo.optional;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int num3;
		
		System.out.println("num1: "+num1+" "+"num2: "+num2);
		
	//	num3=(num1 > num2) ? num1+num2 : num2; //here, if-else conditon is applied.if 1st condtion is passed then after ? part is proceed, if 1st part is failure after : part is proceed
		num3=(num1 < num2) ? num1+num2 : num2;
		System.out.println(num3);
				
	}

}
