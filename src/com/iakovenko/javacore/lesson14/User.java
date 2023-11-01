package com.iakovenko.javacore.lesson14;

public class User <F> {

    private  F id;

    public User(F id) {
        this.id = id;
    }

    public F getId() {
        return id;
    }
}
