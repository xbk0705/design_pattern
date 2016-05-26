package com.bonc.design_pattern.observer;

/**
 * 主题类接口。
 * 用来定义注册观察者、移除观察者、通知更新等方法
 * @author xiabaike
 * @date 2016-04-04
 */
public interface Subject {

	/**
	 * 注册观察者
	 * */
	public void registerObserver(Observer o);
	
	/**
	 * 移除观察者
	 * */
	public void removeObserver(Observer o);
	
	/**
	 * 当状态改变时，调用此方法，通知所有观察者
	 * */
	public void notifyObservers();
}
