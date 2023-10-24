package com.iakovenko.javacore.lesson11;

import java.util.Arrays;

public class TestEnum {

    public static void main(String[] args) {

        Planet earth = Planet.EARTH;

        System.out.println(earth);

        Planet[]planets = Planet.values();
        System.out.println(Arrays.toString(planets));
        System.out.println(Planet.EARTH.ordinal());

        System.out.println(earth.getName());





    }
}
