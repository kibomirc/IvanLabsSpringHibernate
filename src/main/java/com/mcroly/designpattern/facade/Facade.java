package com.mcroly.designpattern.facade;

public class Facade {

	private Subsystem system;
	
	public Facade(Subsystem system) {
		this.system = system;
	}
	
	public void start() {
		system.config();
		system.loadScript();
		system.checkScript();
		system.loginUser();
		system.checkUser();
		
	}
	
	public void stop() {
		system.logoutUser();
		system.unloadScript();
		system.resetConfig();
	}
	
}
