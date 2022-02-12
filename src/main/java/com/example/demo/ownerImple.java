package com.example.demo;

public class ownerImple extends Area implements House  {

	@Override
	public void owner() {
		
		System.out.println("The Owner name is Mariadhas");
	}
	
	@Override
	public void tenant(String a) {
		
		System.out.println("The tenant name was "+a);
	}
	
	
	
	

}
