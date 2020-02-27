package com.mcroly.designpattern.decorator;

public class UserConcreteDecoratorWa extends UserDecorator {

    private User user;
    private String numero = new String();
    private final String chat = "WhatsApp ";
    

    public UserConcreteDecoratorWa(User user,String numero){
        this.user = user;
        this.numero = numero;
    }

    @Override
    public String getNickname() {
    	System.out.println("Stampo numero " + numero);
        return user.getNickname() + "ed è iscritta a " + chat;
    }

}
