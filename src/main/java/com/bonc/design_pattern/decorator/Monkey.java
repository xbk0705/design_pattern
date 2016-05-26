package com.bonc.design_pattern.decorator;

/**
 * 孙悟空的本尊，并且定义了七十二变的方法。
 * 抽象构件(Component)角色
 */
public abstract class Monkey {
	
	protected String type = "本尊";

	protected abstract void change();
	
	public String getType() {
		return type;
	}
}
