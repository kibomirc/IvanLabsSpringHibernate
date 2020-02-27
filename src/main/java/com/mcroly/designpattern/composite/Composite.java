package com.mcroly.designpattern.composite;

public abstract class Composite {
	public void operation() {}
	public void addChild(Composite composite) { 
		System.out.println("Operazione non consentita");
	}
	public void removeChild(Composite composite) { 
		System.out.println("Operazione non consentita");
	}
	
	
	
}
