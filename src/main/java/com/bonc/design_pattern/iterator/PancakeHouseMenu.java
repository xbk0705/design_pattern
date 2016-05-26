package com.bonc.design_pattern.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	ArrayList<MenuItem> items;
	
	public PancakeHouseMenu(ArrayList<MenuItem> items){
		this.items = items;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseIterator(items);
	}
}
