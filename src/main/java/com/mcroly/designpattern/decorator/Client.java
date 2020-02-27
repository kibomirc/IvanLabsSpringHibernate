package com.mcroly.designpattern.decorator;

public class Client {

    public static void main(String[] args) {

       User user = new UserImpl();
       user = new UserConcreteDecoratorWa(user,"123456789");
       System.out.println(user.getNickname());
        
       user = new UserConcreteDecoratorFacebook(user);
       System.out.println(user.getNickname());
       
       user = new UserConcreteDecoratorWa(user,"xxx");
       System.out.println(user.getNickname());
        

    }
}
