package com.bonc.design_pattern.observer;

/**
 * 观察者类接口。
 * 当主题状态发生改变时，主题会把这些状态值当做方法的参数，传送给观察者。
 * @author xiabaike
 * */
public interface Observer {

	/**
	 * 当主题状态发生改变时，主题会把这些状态值当做方法的参数，传送给观察者
	 * 所有观察者都必须实现此方法，以实现观察者接口
	 * */
	public void  update(float temp, float humidity, float pressure);
	
}
