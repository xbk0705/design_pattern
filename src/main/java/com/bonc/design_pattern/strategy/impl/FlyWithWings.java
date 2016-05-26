package com.bonc.design_pattern.strategy.impl;

import com.bonc.design_pattern.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	public void fly() {
		System.out.println("T'm flying!!!");
	}

}
