package com.iakovenko.javacore.lesson10.animals;

public class TestEquals {
    public static void main(String[] args) {

        String[] likeToEat01 = new String[]{"Beef","Pork"};
        String[] likeToEat02 = new String[]{"Chicken","Fish"};


        Wolf wolf01 = new Wolf(likeToEat01, "Grey");
        Wolf wolf02 = new Wolf(likeToEat01, "Grey");
        wolf02.setName("Jack");
        wolf01.setName("Jac");

        Wolf wolf03 = new Wolf(likeToEat02, "White");

        System.out.println(wolf01.equals(wolf02));
       // System.out.println(wolf01.equals(wolf03));



    }
}
