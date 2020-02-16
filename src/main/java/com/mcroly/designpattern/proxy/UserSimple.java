package com.mcroly.designpattern.proxy;

public class UserSimple implements User {
	
	ProxyObject proxy = new ProxyObject(this);
	
	private boolean admin = false;
	private String user = "UserSimple";
	
	@Override
	public boolean isAdmin() {
		return admin;
	}
	
	@Override
	public String getUser() {
		return user;
	}
	
	@Override
	public void setProxy(ProxyObject proxy) {
	  this.proxy = proxy;
	}

	@Override
	public void operation() {
		proxy.ProxyOperationAdministratorPermission();
	}
	

}
