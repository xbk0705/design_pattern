package com.bonc.design_pattern.observer;

import com.bonc.design_pattern.observer.impl.CurrentConditionsDisplay;
import com.bonc.design_pattern.observer.impl.WeatherData;

/**
 * 主类，模拟气象站产生检测数据，并更新给布告板
 * */
public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData subject = new WeatherData();
		CurrentConditionsDisplay observer = new CurrentConditionsDisplay(subject);
		subject.setMeasurements(1, 2, 3);
	}

}
