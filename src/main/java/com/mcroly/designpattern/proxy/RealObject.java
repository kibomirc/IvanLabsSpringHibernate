package com.mcroly.designpattern.proxy;

public class RealObject {
	
	private String stringForAdmin = "password";

	public String getStringForAdmin() {
		return stringForAdmin;
	}

	public void setStringForAdmin(String stringForAdmin) {
		this.stringForAdmin = stringForAdmin;
	}
	
}
