package com.iakovenko.javacore.lesson08;

 public abstract class Vehicle {
    protected String number; // null
    protected int levelOfWare; // 0
    protected int maxSpeed = 120; // 120

    protected    String defaultColour = "White";

    public Vehicle(String number) {
        this.number = number;
    }
    public Vehicle(String number, int maxSpeed){
        this(number);
        this.maxSpeed = maxSpeed;
    }

     public String getDefaultColour() {
         return defaultColour;
     }

     public String getNumber(){
        return number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLevelOfWare(){
        return levelOfWare;
    }

    public void incLevelOfWare(int value){
        if (value < 0) return;
        levelOfWare += value;
    }
    public void repair(){
        if (levelOfWare > 0) levelOfWare--;
    }

    public abstract void stop();

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", levelOfWare=" + levelOfWare +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
