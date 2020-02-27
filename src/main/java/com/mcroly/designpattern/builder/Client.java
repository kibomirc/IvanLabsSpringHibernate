package com.mcroly.designpattern.builder;

public class Client {

	public static void main(String[] args) {
		
	
		InterfaceBuilder builder = new ConcreteBuilder();
	
		Director director = new Director(builder);

	// Creazione primo oggetto
		
		Product persona = director.getPersona();
		
		director.makePersona();
		
		System.out.println(persona.getName() + " " + persona.getSurname());
		
	// Creazione secondo oggetto
		
		builder = new ConcreteBuilderIvan();
		
		director.setBuilder(builder);
		
		persona = director.getPersona();
		
		director.makePersona();
		
		System.out.println(persona.getName() + " " + persona.getSurname());
		
		
	}
	
	
	
}
