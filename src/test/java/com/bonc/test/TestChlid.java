package com.bonc.test;

public class TestChlid extends TestParent{

	static String chlid = "chllid";
	static{
		System.out.println("chlid static{...}");
	}
	{
		System.out.println("chlid{...}");
	}
	public TestChlid() {
		System.out.println("子构造器。。。。");
	}
	
	public static void main(String[] args) {
		TestChlid chlid = new TestChlid();
	}
}
