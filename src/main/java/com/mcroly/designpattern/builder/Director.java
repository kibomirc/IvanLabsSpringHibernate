package com.mcroly.designpattern.builder;

public class Director {

	private InterfaceBuilder persona;
	
	Director(InterfaceBuilder p) {
		this.persona = p;
	}
	
	public void makePersona() {
		persona.buildName();
		persona.buildSurname();
	}
	
	public Product getPersona() {
		return persona.getPersona();
	}
	
	
	
	
}
