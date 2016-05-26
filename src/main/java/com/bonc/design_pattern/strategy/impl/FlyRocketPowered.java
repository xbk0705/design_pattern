package com.bonc.design_pattern.strategy.impl;

import com.bonc.design_pattern.strategy.FlyBehavior;

/**
 * 
 */
public class FlyRocketPowered implements FlyBehavior{

	public void fly() {
		System.out.println("I'm fly with a rocket!");
	}

}
