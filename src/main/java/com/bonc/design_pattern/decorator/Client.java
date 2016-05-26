package com.bonc.design_pattern.decorator;

public class Client {

	public static void main(String[] args) {
		Monkey monkey = new MonkeyKing();
		Monkey fish = new Fish(monkey);
		Monkey fish2 = new Fish(fish);
		Monkey bird = new Bird(fish2);
		System.out.println(bird.getType());
		bird.change();
	}
	
}
