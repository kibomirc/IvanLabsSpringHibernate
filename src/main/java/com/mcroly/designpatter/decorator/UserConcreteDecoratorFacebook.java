package com.mcroly.designpatter.decorator;

public class UserConcreteDecoratorFacebook extends UserDecorator {

    private User user;
    private final String chat = "Facebook ";
    public UserConcreteDecoratorFacebook(User user) {
        this.user = user;
    }

    @Override
    public String getNickname() {
        return user.getNickname() + "ed è iscritta a " + chat;
    }
}
