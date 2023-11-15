package com.iakovenko.javacore.lesson19;

public abstract class Vehicle implements Repairable{
    protected String number;
    protected int levelOfWare;

    public Vehicle(String number) {
        setNumber(number);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", levelOfWare=" + levelOfWare +
                '}';
    }

    public String getNumber(){
        return number;
    }

    public int getLevelOfWare(){
        return levelOfWare;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void incLevelOfWare(int value){
        if (value < 0) return;
        levelOfWare += value;
    }
    public void repair(){
        if (levelOfWare > 0) levelOfWare--;
    }

    public abstract void breakDown();
}

