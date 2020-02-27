package com.mcroly.designpattern.decorator;

public class UserConcreteDecoratorFacebook extends UserDecorator {

    private User user;
    private final String chat = "Facebook ";
    public UserConcreteDecoratorFacebook(User user) {
        this.user = user;
    }

    @Override
    public String getNickname() {
    	System.out.println("Account Facebook : Anonimo"); // LIFO
        return user.getNickname() + "ed è iscritta a " + chat; // user.getNickname => FIFO
    }
}
