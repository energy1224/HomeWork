package com.iakovenko.javacore.lesson1516.TestMyLinkedList;

public class User {

    private String sex;

    private String name;

    private boolean isWorking;

    public User(String sex, String name, boolean isWorking) {
        this.sex = sex;
        this.name = name;
        this.isWorking = isWorking;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public String toString() {
        return "User{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
