package com.bonc.design_pattern.decorator;

/**
 * 齐天大圣
 * 具体构件(ConcreteComponent)角色
 * */
public class MonkeyKing extends Monkey{

	public MonkeyKing() {
		type = "齐天大圣 -> ";
	}
	
	@Override
	protected void change() {
		System.out.println("七十二变......");
	}

}
