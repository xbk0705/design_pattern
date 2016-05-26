package com.bonc.design_pattern.builder;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		JPanel panel = director.constructProduct();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setBounds(12, 12, 200, 120);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
