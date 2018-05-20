package com.hemant.gson.demo;

public class RestaurantOwner {
	private String name;
	private UserAddress userAddress;

	public RestaurantOwner() {

	}

	public RestaurantOwner(String name, UserAddress userAddress) {
		super();
		this.name = name;
		this.userAddress = userAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}

}
