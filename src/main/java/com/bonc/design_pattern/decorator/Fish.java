package com.bonc.design_pattern.decorator;

/**
 * 变化后为鱼
 * 具体装饰(ConcreteDecorator)角色
 * */
public class Fish extends ChangeMonkey{

	private Monkey monkey;
	
	public Fish(Monkey monkey) {
		this.monkey = monkey;
	}
	
	@Override
	protected void change() {
		System.out.println("变化为 Fish ......");
	}

	public String getType() {
		return monkey.getType() + "fish -> ";
	}
}
