package com.example.demo.methodReference;

import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {

	static Supplier<List<StudentModel>> supp = () -> StudentsValues.getDetails();
	
	public static void main(String[] args) {
		System.out.println("Supplier: "+ supp.get());

	}

}
