package com.mcroly.designpattern.proxy;

public class ProxyObject {
      
	private RealObject realObject = new RealObject();
    private User user;
    
    ProxyObject(User user) {
    	this.user = user;
    }
    
	public void ProxyOperationAdministratorPermission() { 
		if(user.isAdmin()) {
			System.out.println(realObject.getStringForAdmin());
		} else {
			System.out.println("Permesso Negato");
		}
	}
      
}
