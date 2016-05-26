package com.bonc.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类
 * */
public class Composite extends Component{
	
	String name;
	private List<Component> child = new ArrayList<Component>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component component) {
		child.add(component);
	}
	
	@Override
	public void remove(Component component) {
		child.remove(component);
	}
	
	@Override
	public void foreach(){
		for(Component component : child) {
			System.out.println(component.getName());
		}
	}
	
	@Override
	public String getName() {
		return name;
	}
}
