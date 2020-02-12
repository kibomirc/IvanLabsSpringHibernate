package com.mcroly.designpattern.builder;

public class Client {

	public static void main(String[] args) {
		
		InterfaceBuilder builder = new ConcreteBuilder();
	
		Director director = new Director(builder);

		Product persona = director.getPersona();
		
		director.makePersona();
		
		System.out.println(persona.getName() + " " + persona.getSurname());
	
	}
	
	
	
}
