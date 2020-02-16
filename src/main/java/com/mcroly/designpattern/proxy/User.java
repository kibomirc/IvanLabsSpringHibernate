package com.mcroly.designpattern.proxy;

public interface User {
	
	public boolean isAdmin();
	public String getUser();
	public void operation();
	public void setProxy(ProxyObject proxy);
	

}
