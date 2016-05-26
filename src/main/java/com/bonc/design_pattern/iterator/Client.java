package com.bonc.design_pattern.iterator;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<MenuItem> pancakeItems = new ArrayList<MenuItem>();
		pancakeItems.add(new MenuItem("干锅土豆" , "", false, 10));
		pancakeItems.add(new MenuItem("巫山烤鱼", "", true, 30));
		pancakeItems.add(new MenuItem("炝炒土豆丝", "", false, 20));
		PancakeHouseMenu pancakeMenu = new PancakeHouseMenu(pancakeItems);
		
		MenuItem[] dinerItems = new MenuItem[3];
		dinerItems[0] = new MenuItem("煎饼", "", false, 5);
		dinerItems[1] = new MenuItem("绿豆粥", "", false, 3);
		dinerItems[2] = new MenuItem("咸菜", "", false, 5);
		DinerMenu dinerMenu = new DinerMenu(dinerItems);
		
		Waitress waitress = new Waitress(dinerMenu, pancakeMenu);
		waitress.printMenu();
	}
	
}
