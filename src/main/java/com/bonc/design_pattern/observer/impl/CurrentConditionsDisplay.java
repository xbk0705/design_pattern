package com.bonc.design_pattern.observer.impl;

import com.bonc.design_pattern.observer.DisplayElement;
import com.bonc.design_pattern.observer.Observer;
import com.bonc.design_pattern.observer.Subject;

/**
 * 具体布告板实现类。获取状态值，并展示
 * */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float tempPerature;
	private float humidity;
	private float pressure;
	private Subject subject;
	
	public CurrentConditionsDisplay(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	public void update(float temp, float humidity, float pressure) {
		this.tempPerature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + tempPerature +", "+ humidity +", "+ pressure);
	}
}
