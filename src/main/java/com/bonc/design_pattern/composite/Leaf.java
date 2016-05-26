package com.bonc.design_pattern.composite;

/**
 * 子节点
 * */
public class Leaf extends Component{

	String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component component) {
		System.out.println("不存在子节点，无法添加。。。");
	}
	
	@Override
	public void remove(Component component) {
		new UnsupportedOperationException();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
}
