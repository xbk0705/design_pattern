package com.bonc.design_pattern.iterator;

public class Waitress {

	DinerMenu dinerMenu;
	PancakeHouseMenu pancakeMenu;
	
	public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeMenu = pancakeMenu;
	}
	
	public void printMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator pancakeIterator = pancakeMenu.createIterator();
		System.out.println("Diner menu......");
		printMenu(dinerIterator);
		System.out.println("Pancake House Menu......");
		printMenu(pancakeIterator);
	}
	
	private void printMenu(Iterator iterator){
		MenuItem item;
		while(iterator.hasNext()) {
			item = (MenuItem) iterator.next();
			System.out.print("Name : "+ item.getName() +", ");
			System.out.println("Price : "+ item.getPrice());
		}
	}
	
}
