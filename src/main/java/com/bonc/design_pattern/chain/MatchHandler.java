package com.bonc.design_pattern.chain;

public class MatchHandler extends Handler{

	@Override
	protected int handler(int num) {
		num++;
		System.out.println("match......"+ num);
		return num;
	}

	@Override
	protected void setup(String str) {
		System.out.println("match......"+ str);
	}
}
