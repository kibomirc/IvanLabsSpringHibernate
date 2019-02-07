package com.mcroly.designpatter.decorator;

class UserImpl implements User {

    private String nickname = "Persona";

    @Override
    public String getNickname() {
        return nickname;
    }

}
