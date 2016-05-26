package com.bonc.design_pattern.chain;

public class AuditHandler extends Handler{

	@Override
	protected int handler(int num) {
		num++;
		System.out.println("audit......"+ num);
		return getHandler().handler(num);
	}

	@Override
	protected void setup(String str) {
		System.out.println("audit......"+ str);
	}

}
