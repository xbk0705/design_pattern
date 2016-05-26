package com.bonc.design_pattern.builder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 具体生成器 
 * */
public class ConcreteBuilder implements Builder{
	
	private PanelProduct product;

	public ConcreteBuilder() {
		product = new PanelProduct();
	}
	
	public void buildButton() {
		product.button = new JButton("按钮");
	}

	public void buildLabel() {
		product.label = new JLabel("标签");
	}

	public void buildTextField() {
		product.textfield = new JTextField("文本框");
	}

	public JPanel getPanel() {
		product.add(product.button);
		product.add(product.label);
		product.add(product.textfield);
		return product;
	}

}