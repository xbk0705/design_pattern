package com.bonc.design_pattern.strategy;

import com.bonc.design_pattern.strategy.impl.FlyWithWings;
import com.bonc.design_pattern.strategy.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck!!!");
	}
	
}
