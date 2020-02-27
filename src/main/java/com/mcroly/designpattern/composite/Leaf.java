package com.mcroly.designpattern.composite;

public class Leaf extends Composite{
	@Override
	public void operation() {
		System.out.println("Operazione figlio semplice");
	}
}
