package com.bonc.design_pattern.chain;

public class CleanHandler extends Handler{

	@Override
	protected int handler(int num) {
		num++;
		System.out.println("clean......"+ num);
		return getHandler().handler(num);
	}

	@Override
	protected void setup(String str) {
		System.out.println("clean......"+ str);
	}
}
