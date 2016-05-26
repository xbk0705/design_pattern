package com.bonc.design_pattern.setup;

public abstract class Animal {
	
	public abstract void makesound();

}

class Dog extends Animal{

	@Override
	public void makesound() {
		bark();
	}
	
	private void bark() {
		System.out.println("汪汪......");
	}
}

class Cat extends Animal{

	@Override
	public void makesound() {
		meow();
	}
	
	private void meow(){
		System.out.println("喵喵......");
	}
}