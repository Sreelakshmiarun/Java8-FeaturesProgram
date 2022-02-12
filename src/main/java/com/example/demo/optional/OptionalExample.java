package com.example.demo.optional;
                                                        //This program is error, don't consider this....
import java.util.Optional;

import com.example.demo.streamApi.StudentModel;
import com.example.demo.streamApi.StudentsValues;

public class OptionalExample {

	public static void main(String[] args) {
		//Optional<String> name = Optional.ofNullable("arundhas");
		Optional<String> name = Optional.ofNullable(myName("arun"));
		//name = null;   //here, overrided happened, so it does not optional data so it returns null pointer exception
		name = Optional.empty();  //here, optional data is presnted but it is empty so it returns our custom error msg 
		//System.out.println("Name: "+name.get());  // If without get opertion, it will return option data,if used get operation ,return actual data
        // System.out.println(name.isPresent() ? name.get() : "Record Not Found");
        // System.out.println(getStudent(new StudentModel()));   //created new instance for student and null value 
        // System.out.println(getStudentss(StudentsValues.getStudent())); // here, we passed the values for above line
        // System.out.println(getStudentsOptional(StudentsValues.getStudentOptional()).get());
	}
	
	
	


	static String myName(String name) {
		return name;
	}
  
//	static String getStudentss(StudentModel sm) {
//		if(null != sm) {
//			return sm.getName();
//		}
//		
//		return "No Record Found...";
//		
//	}
	
	
	static Optional<String>  getStudentsOptional(Optional<StudentModel> sm) {
		
		if(sm.isPresent()) {
			
			return Optional.of(sm.get().getName());
			
		}
		else {
			return Optional.empty();
			
		}
		
		
	
	
	}
	
}
