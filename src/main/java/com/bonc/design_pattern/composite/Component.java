package com.bonc.design_pattern.composite;

/**
 * 为组合中所有对象定义一个接口，不管是组合还是节点
 * */
public abstract class Component {

	public void add(Component component) {
		new UnsupportedOperationException();
	}
	
	public void remove(Component component) {
		new UnsupportedOperationException();
	}
	
	public String getName() {
		return null;
	}
	
	public void foreach(){
		new UnsupportedOperationException();
	}
}
