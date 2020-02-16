package com.mcroly.designpattern.proxy;

public class Client {
	
    public static void main(String[] args) {

		User admin = new UserAdmin();
		ProxyObject proxy = new ProxyObject(admin);
		admin.setProxy(proxy);
		
		
		User utente = new UserSimple();
		proxy = new ProxyObject(utente);
		utente.setProxy(proxy);
		
		
		utente.operation();
		admin.operation();
		
	}

}
