package com.mcroly.designpattern.composite;

import java.util.ArrayList;

public class Composer extends Composite {
	
	ArrayList<Composite> listChild = new ArrayList<Composite>();
	
	@Override
	public void operation() {
		System.out.println("Stampo un composer che può essere incluso e che può contenere figli");
		for(Composite leaf:listChild) {
			leaf.operation();
		}
	}
	
	@Override
	public void addChild(Composite leaf) { 
		listChild.add(leaf);
	}
	
	@Override
	public void removeChild(Composite composite) { 
		listChild.remove(composite);
	}
	
}
