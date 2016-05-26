package com.bonc.design_pattern.builder;

import javax.swing.JPanel;

/**
 * 抽象生成器
 * */
public interface Builder {

	public void buildButton();
	
	public void buildLabel();
	
	public void buildTextField();
	
	public JPanel getPanel();
	
}
