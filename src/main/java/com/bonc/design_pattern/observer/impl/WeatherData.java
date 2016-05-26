package com.bonc.design_pattern.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.bonc.design_pattern.observer.Observer;
import com.bonc.design_pattern.observer.Subject;

/**
 * 天气数据类。产生更新状态值，并通知布告板观察者
 * */
public class WeatherData implements Subject{
	
	// 用来存放所有的观察者
	private List<Observer> observerList;

	private float tempPerature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	public void removeObserver(Observer o) {
		if(observerList.contains(o)) {
			observerList.remove(o);
		}
	}

	public void notifyObservers() {
		for(int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(tempPerature, humidity, pressure);
		}
	}
	
	/**
	 * 当从气象站得到更新观测值时，通知观察者
	 * */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.tempPerature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}
