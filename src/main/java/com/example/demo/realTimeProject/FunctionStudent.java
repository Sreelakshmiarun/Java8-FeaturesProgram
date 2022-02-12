package com.example.demo.realTimeProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudent {
 
	static Predicate<StudentModel> ps = stu -> stu.getAge() > 18;
	static Predicate<StudentModel> pss= stu -> stu.getGender().equals("female");
	
      static Function<List<StudentModel>, Map<Integer,String>> fun = list -> {
	
	Map<Integer,String> map = new HashMap<Integer,String>();
	
	list.forEach(stu -> {
     if(ps.and(pss).test(stu))
     {
    	 map.put(stu.getId(), stu.getName());
     }
			
	});
	
	return map;
      };
	
	public static void main(String[] args) {
		
		List<StudentModel> list = StudentsValues.getDetails();
		System.out.println(fun.apply(list));
		

	}

}
