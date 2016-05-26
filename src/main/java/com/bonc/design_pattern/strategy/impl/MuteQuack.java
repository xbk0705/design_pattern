package com.bonc.design_pattern.strategy.impl;

import com.bonc.design_pattern.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
