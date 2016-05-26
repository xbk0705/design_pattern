package com.bonc.design_pattern.strategy.impl;

import com.bonc.design_pattern.strategy.QuackBehavior;

public class Quack implements QuackBehavior{

	public void quack() {
		System.out.println("Quack!!!");
	}

}
