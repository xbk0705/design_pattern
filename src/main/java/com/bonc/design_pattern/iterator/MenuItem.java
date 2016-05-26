package com.bonc.design_pattern.iterator;

/**
 * 菜单项
 * */
public class MenuItem {
	
	String name;
	String description;
	// 是否为素食
	boolean vegetarion;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarion, double price) {
		this.name = name;
		this.description = description;
		this.vegetarion = vegetarion;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarion() {
		return vegetarion;
	}

	public double getPrice() {
		return price;
	}

}
