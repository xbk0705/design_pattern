package com.bonc.test;

public class TestParent {
	
	static String str = "static str";

	static {
		System.out.println("static{...}");
	}
	{
		System.out.println("{...}");
	}
	
	public TestParent() {
		System.out.println(str+"  构造器。。。。");
	}
}
