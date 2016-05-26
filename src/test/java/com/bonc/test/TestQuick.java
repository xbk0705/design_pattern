package com.bonc.test;

import java.util.ArrayList;
import java.util.List;

public class TestQuick {
	
	// 以第一个为中轴，排序
	public static void modile(int[] arr , int low, int height){
		int tmp = arr[low];
		while(true){
			
		}
	}
	
	public static void sort1(){
		List<String> list = new ArrayList<String>();
		list.add("手机号");
		list.add("身份证号");
		list.add("姓名");
		list.add("性别");
		list.add("通话时长");
		//String[] rule = {"3","*","2","4","1","5"};
		List<String> rule = new ArrayList<String>();
		rule.add("2");
		rule.add("*");
		rule.add("1");
		rule.add("3");
		rule.add("0");
		rule.add("4");
		int indexFlag = 10000;
		if(rule.contains("*")) {
			indexFlag = rule.indexOf("*");
			rule.remove(indexFlag);
		}
		int index;
		for(int i = 0; i < rule.size(); i++){
			index = Integer.parseInt(rule.get(i));
			rule.set(i, list.get(index));
		}
		System.out.println(rule.toString());
	}
	
	//[姓名, 身份证号, 性别, 手机号, 通话时长]
	public static void sort2(){
		List<String> list = new ArrayList<String>();
		list.add("手机号");
		list.add("身份证号");
		list.add("姓名");
		list.add("性别");
		list.add("通话时长");
		//String[] rule = {"3","1","0","2","4",""};
		List<String> rule = new ArrayList<String>();
		rule.add("3");
		rule.add("*");
		rule.add("1");
		rule.add("0");
		rule.add("2");
		rule.add("4");
		int indexFlag = 10000;
		if(rule.contains("*")) {
			indexFlag = rule.indexOf("*");
			rule.remove(indexFlag);
		}
		
	}
	
	public static void main(String[] args) {
		
	}

}
