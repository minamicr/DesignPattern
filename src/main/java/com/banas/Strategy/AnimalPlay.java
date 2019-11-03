package com.banas.Strategy;

public class AnimalPlay {

	public static void main (String[] args) {
		Animal toto = new Dog();
		Animal loro = new Bird();
		
		System.out.println("Dog: " + toto.tryToFly());
		System.out.println("Bird: " + loro.tryToFly());
		
		toto.setFlyingAbility(new ItFlys());
		System.out.println("Dog: " + toto.tryToFly());
	}
}
