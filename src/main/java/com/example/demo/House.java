package com.example.demo;

@FunctionalInterface
public interface House  {
	
	void owner();
	
	default void tenant(String s)
	{
		//return "Tenant name was"+ s;
		System.out.println("arundhasarundhas");
	}
	
	public static String payment(String t)
	{
		return "That payment was"+ t;
	}

	//void tenant();
	
	

}
