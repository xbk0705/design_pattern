package com.bonc.design_pattern.iterator;

import java.util.ArrayList;

/**
 * 煎饼屋菜单迭代器
 * */
public class PancakeHouseIterator implements Iterator{

	ArrayList<MenuItem> items;
	int position = 0;
	
	public PancakeHouseIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null) {
			return false;
		}
		return true;
	}

	public Object next() {
		MenuItem item = items.get(position);
		position++;
		return item;
	}

}
