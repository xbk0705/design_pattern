package com.bonc.design_pattern.iterator;

/**
 * 餐厅菜单迭代器    具体迭代器角色
 * */
public class DinerMenuIterator implements Iterator{

	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	public Object next() {
		MenuItem item = items[position];
		position++;
		return item;
	}

}
