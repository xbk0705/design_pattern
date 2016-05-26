package com.bonc.design_pattern.builder;

import javax.swing.JPanel;

/**
 * 指挥者
 * */
public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public JPanel constructProduct() {
		builder.buildButton();
		builder.buildLabel();
		builder.buildTextField();
		JPanel panel = builder.getPanel();
		return panel;
	}
	
}