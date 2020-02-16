package com.mcroly.designpattern.facade;

public class Client {
	
	public static void main(String[] args) {
	Subsystem subsystem = new Subsystem();
	Facade facade = new Facade(subsystem);

	facade.start();
	facade.stop();
	
	
	
	}
	
}
