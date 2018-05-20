package com.hemant.gson.demo;

public class Founder {
	private String name;
	private int starCount;

	public Founder(String name, int starCount) {
		super();
		this.name = name;
		this.starCount = starCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStarCount() {
		return starCount;
	}

	public void setStarCount(int starCount) {
		this.starCount = starCount;
	}
	
	@Override
	public String toString() {
		return "Founder: [name: " + this.name + ", " + this.starCount + "]";
	}
}
