package com.example.demo.smallStreamProject;

public class MovieBean {
	
	private String movieName;
	private int releaseyear;
	private String actorName;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public MovieBean(String movieName, int releaseyear, String actorName) {
		super();
		this.movieName = movieName;
		this.releaseyear = releaseyear;
		this.actorName = actorName;
	}
	
	
	

}
