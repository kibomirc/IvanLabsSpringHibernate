package com.mcroly.designpattern.builder;

public class ConcreteBuilder implements InterfaceBuilder {

	private Product persona = new Product();
	
	@Override
	public void buildName() {
	
		persona.setName("Nome");
		
	}

	@Override
	public void buildSurname() {
		
		persona.setSurname("Cognome");
		
	}
	
	@Override
	public Product getPersona() {
		return persona;
	}

}
