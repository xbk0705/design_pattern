package com.bonc.design_pattern.iterator;

/**
 * 餐厅菜单
 * */
public class DinerMenu {
	
	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	MenuItem[] items;
	
	public DinerMenu(MenuItem[] items){
		this.items = items;
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(items);
	}
}
