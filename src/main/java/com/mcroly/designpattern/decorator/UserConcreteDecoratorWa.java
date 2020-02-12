package com.mcroly.designpattern.decorator;

public class UserConcreteDecoratorWa extends UserDecorator {

    private User user;
    private final String chat = "WhatsApp ";

    public UserConcreteDecoratorWa(User user){
        this.user = user;
    }

    @Override
    public String getNickname() {
        return user.getNickname() + "ed è iscritta a " + chat;
    }

}
