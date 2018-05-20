package com.hemant.gson.demo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App {
	public static void main(String[] args) {
		//serializeJson();
		desearilizeJson();
	}

	public static void serializeJson() {
		UserAddress userAddress = new UserAddress("Main Street", "42A", "Fairfax", "United States");
		RestaurantOwner restaurantOwner = new RestaurantOwner("Rajesh", userAddress);
		RestaurantStaff cook = new RestaurantStaff(18, "Mike", 3000);
		RestaurantStaff waiter = new RestaurantStaff(25, "Thomas", 5000);
		
		RestaurantMenuItem item1 = new RestaurantMenuItem("Steak", 20.0d);
		RestaurantMenuItem item2 = new RestaurantMenuItem("Sphagetti", 5.0d);
		RestaurantMenuItem item3 = new RestaurantMenuItem("Hot Dog", 3.0d);
		
		List<RestaurantMenuItem> menuItems = new ArrayList<RestaurantMenuItem>();
		menuItems.add(item1);
		menuItems.add(item2);
		menuItems.add(item3);
		
		Restaurant restaurant = new Restaurant("Rajesh's Mo:Mo house", restaurantOwner, cook, waiter, menuItems);
		
		Gson gson = new Gson();
		String json = gson.toJson(restaurant);
		System.out.println(json);
	}
	
	public static void desearilizeJson() {
		String json = "[{\n" + 
				"	\"name\" : \"Hemant\",\n" + 
				"	\"starCount\" : 2\n" + 
				"}, \n" + 
				"{\n" + 
				"	\"name\" : \"Rajesh\",\n" + 
				"	\"starCount\" : 3\n" + 
				"},\n" + 
				"{\n" + 
				"	\"name\" : \"Simon\",\n" + 
				"	\"starCount\" : 5\n" + 
				"}\n" + 
				"]";
		Gson gson = new Gson();
		
		Type founderListType = new TypeToken<ArrayList<Founder>>(){}.getType();
		
		List<Founder> founders = gson.fromJson(json, founderListType);
		
		System.out.println(founders);
	}
}
