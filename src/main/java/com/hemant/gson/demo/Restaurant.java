package com.hemant.gson.demo;

import java.util.List;

public class Restaurant {
	private String name;

	private RestaurantOwner owner;
	private RestaurantStaff cook;
	private RestaurantStaff waiter;

	private List<RestaurantMenuItem> items;
	
	public Restaurant(String name, RestaurantOwner owner, RestaurantStaff cook, RestaurantStaff waiter, List<RestaurantMenuItem> menuItems) {
		super();
		this.name = name;
		this.owner = owner;
		this.cook = cook;
		this.waiter = waiter;
		this.items = menuItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RestaurantOwner getOwner() {
		return owner;
	}

	public void setOwner(RestaurantOwner owner) {
		this.owner = owner;
	}

	public RestaurantStaff getCook() {
		return cook;
	}

	public void setCook(RestaurantStaff cook) {
		this.cook = cook;
	}

	public RestaurantStaff getWaiter() {
		return waiter;
	}

	public void setWaiter(RestaurantStaff waiter) {
		this.waiter = waiter;
	}

	public List<RestaurantMenuItem> getItems() {
		return items;
	}

	public void setItems(List<RestaurantMenuItem> items) {
		this.items = items;
	}

}
