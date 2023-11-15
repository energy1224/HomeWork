package com.iakovenko.javacore.lesson19;

public class MiniCar extends Car implements Runnable{
    public MiniCar(Color color, String number) {
        super(color, number);
    }


    @Override
    public String toString() {
        return "Car{" +
                "color=" + getColor() +
                ", number='" + number + '\'' +
                ", levelOfWare=" + levelOfWare +
                '}';
    }

    @Override
    public void run() {
        incLevelOfWare(1);
    }
}