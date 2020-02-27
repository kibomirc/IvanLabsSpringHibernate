package com.mcroly.designpattern.composite;

public class Client {

	public static void main (String[] args) {
	
	Composite leaf = new Leaf();
	Composite leaf2 = new Leaf();
	Composite composer = new Composer();
	
	composer.addChild(leaf);
	composer.addChild(leaf2);
	composer.operation();
	
	}
	
	
}
