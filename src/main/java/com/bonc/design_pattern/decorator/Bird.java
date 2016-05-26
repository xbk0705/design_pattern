package com.bonc.design_pattern.decorator;

/**
 * 变化后为鸟
 * 具体装饰(ConcreteDecorator)角色
 * */
public class Bird extends ChangeMonkey{

	private Monkey monkey;
	
	public Bird(Monkey monkey) {
		this.monkey = monkey;
	}
	
	@Override
	protected void change() {
		System.out.println("Bird......");
	}

	public String getType() {
		return monkey.getType() + "bird -> ";
	}
}
