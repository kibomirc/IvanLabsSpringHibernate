package com.mcroly.designpattern.proxy;

public class UserAdmin implements User{
	
	ProxyObject proxy;
	
	private boolean admin = true;
	private String user = "UserRoot";
	
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
