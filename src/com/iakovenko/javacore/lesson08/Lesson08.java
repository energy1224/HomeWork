package com.iakovenko.javacore.lesson08;

import java.util.Arrays;

public class Lesson08 {
    public static void main(String[] args) {
        Bicycle bicycle01 = new Bicycle("1v", 60);
        bicycle01.incLevelOfWare(3);
        bicycle01.repair();

        Train train01 = new Train("123P", 130, 13, true);
        train01.incLevelOfWare(3);
        train01.repair();

        Vehicle vehicle = new Bicycle("1vh", 30);
        Bicycle bVehicle02 = (Bicycle) vehicle;

        // проверки по первой задаче

        System.out.println("проверки по первой задаче");
        Car car01 = new Car("456");
        System.out.println(car01.getMaxSpeed());
        System.out.println(car01.getColour());
        car01.changeColour("черный");
        System.out.println(car01.getColour());

        // проверки по второй задаче
        System.out.println("проверки по второй задаче");
        System.out.println("электрический");
        Scooter scooter01 =new Scooter("2",30,true);
        System.out.println(scooter01.getType());
        System.out.println(scooter01.getNumberOfWheels());
        scooter01.incLevelOfWare(4);
        System.out.println(scooter01.getLevelOfWare());
        scooter01.repair();
        System.out.println(scooter01.getLevelOfWare());

        System.out.println("механический");
        Scooter scooter02 =new Scooter("3", 25,false);
        scooter02.incLevelOfWare(2);
        scooter02.repair();
        System.out.println(scooter02.getLevelOfWare());


        // проверки по третьей задаче
        System.out.println("проверки по третьей задаче");

        RepairShop repairShop = new RepairShop();
        Vehicle[]vehicles=new Vehicle[6];
        repairShop.setVehicles(vehicles);

        repairShop.addToVehicles(bicycle01);
        repairShop.addToVehicles(train01);
        repairShop.addToVehicles(bVehicle02);
        repairShop.addToVehicles(car01);
        repairShop.addToVehicles(scooter01);
        repairShop.addToVehicles(scooter02);
        repairShop.addToVehicles(bVehicle02);

        System.out.println(Arrays.toString(vehicles));

        repairShop.repairAll();

        System.out.println(Arrays.toString(vehicles));

        System.out.println(car01.getColour());













    }
}
