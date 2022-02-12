package com.example.demo.smallStreamProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MovieStream {

	public static void main(String[] args) {
		
		List<MovieBean> film = Arrays.asList(new MovieBean("Vaaranam Aayiram",2020,"Surya"),
				                             new MovieBean("Jillunu Oru kathal",2021,"Surya"),
				                             new MovieBean("Valimai",2020,"Ajith"),
				                             new MovieBean("Kaththi",2021,"Vijay"));
		
 //----------------------------- finding movieName via year-------------------------------------------------------------------------------//
		
//		Stream<MovieBean> movieBean = film.stream();
//		Stream<MovieBean> StreamMovie = movieBean.filter(movies -> movies.getReleaseyear()==2021);
//		//StreamMovie.forEach(System.out::println);
//        Stream<String> mapStream = StreamMovie.map(MovieBean::getMovieName);
//        mapStream.forEach(System.out::println);
        
//----------------------------- Finding actorName via year -------------------------------------------------------------------------------//
		
//        Stream<MovieBean> movieActer = film.stream();
//        Stream<MovieBean> actorStream = movieActer.filter(a -> a.getReleaseyear() == 2020);
//        Stream<String> actorMap = actorStream.map(MovieBean::getActorName);
//        actorMap.forEach(System.out::println);
        
//---------------------------------Finding actorName via releaseYear-----------------------------------------------------------------------//
         
		Stream<MovieBean> movStream = film.stream();
		Stream<MovieBean> StreamMov = movStream.filter(m -> m.getReleaseyear() == 2021);
        Stream<String> MovString = StreamMov.map(MovieBean::getActorName);
        MovString.forEach(System.out::println);
        
        
	}

}
