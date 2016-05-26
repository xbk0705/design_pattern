package com.bonc.design_pattern.strategy;

import com.bonc.design_pattern.strategy.impl.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		System.out.println("-----------------------------------");
		
		ModelDuck model2 = new ModelDuck();
		model2.performFly();
		model2.performFly();
	}
	
}
