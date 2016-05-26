package com.bonc.design_pattern.chain;

public class Client {

	public static void main(String[] args) {
		Handler audit = new AuditHandler();
		
		Handler clean = new CleanHandler();
		clean.setup("clean");
		Handler match = new MatchHandler();
		match.setup("macth");
		audit.setup("audit");
		audit.setHandler(clean);
		clean.setHandler(match);
		int num = 0;
		audit.handler(num);
		System.out.println(num);
		test(num);
		System.out.println(num);
	}
	
	public static void test(int num) {
		num = num + 1;
		System.out.println("test:"+num);
	}
	
}
