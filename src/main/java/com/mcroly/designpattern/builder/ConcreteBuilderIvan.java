package com.mcroly.designpattern.builder;

public class ConcreteBuilderIvan implements InterfaceBuilder {

	Product ivan = new Product();
	
	@Override
	public void buildName() {
		ivan.setName("Ivan");
		
	}

	@Override
	public void buildSurname() {
		ivan.setSurname("XXX");
		
	}

	@Override
	public Product getPersona() {
		return ivan;
	}
		
}
