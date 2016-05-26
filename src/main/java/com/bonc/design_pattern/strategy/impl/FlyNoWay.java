package com.bonc.design_pattern.strategy.impl;

import com.bonc.design_pattern.strategy.FlyBehavior;

/**
 * 不会飞
 * 实现飞行行为接口
 */
public class FlyNoWay  implements FlyBehavior{

	public void fly() {
		System.out.println("T'm can't fly!!!");
	}
	
}
