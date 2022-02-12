package com.example.demo.methodReference;

public class MethodReferenceConstrucorCalling {

	public static void main(String[] args) {
		
		dhas ad = arun :: new;   //Syntax of construcor calling via method reference
		arun ar = ad.arundhas("arundhas...");
		System.out.println(ar.getName());
		//System.out.println(ar.getName("Arundhas..."));

	}

}

@FunctionalInterface
interface dhas {
	arun arundhas(String name);
}

class arun {

	private String name;

	public arun(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
