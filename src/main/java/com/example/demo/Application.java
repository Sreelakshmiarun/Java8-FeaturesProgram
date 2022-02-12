package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.model.Trial;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
		ownerImple imple = new ownerImple();
		imple.owner();
		//System.out.println(imple.tenant(""));
		imple.tenant("Arundhasdhas");
		System.out.println(House.payment("2000d")); 
		imple.area();
		
	}

}
