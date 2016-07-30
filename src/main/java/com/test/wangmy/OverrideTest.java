package com.test.wangmy;

public class OverrideTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
	}

}

class Animal{
	public void eat() {
		System.out.println("Animal is eat!");
	}
}

class Dog extends Animal{
	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog is eat!");
	}
}