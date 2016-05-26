package com.bonc.design_pattern.strategy;

import com.bonc.design_pattern.strategy.impl.FlyNoWay;
import com.bonc.design_pattern.strategy.impl.Quack;

public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a model duck!!!");
	}
	
}
