package com.mcroly.designpattern.decorator;

public class UserConcreteDecoratorFacebook extends UserDecorator {

    private User user;
    private final String chat = "Facebook ";
    public UserConcreteDecoratorFacebook(User user) {
        this.user = user;
    }

    @Override
    public String getNickname() {
    	printFb();
        return user.getNickname() + "ed è iscritta a " + chat;
    }
    
    private void printFb() {
    	System.out.println("Account Facebook : Anonimo");
    }
}
