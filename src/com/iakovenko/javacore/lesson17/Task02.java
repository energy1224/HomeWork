package com.iakovenko.javacore.lesson17;

import com.iakovenko.javacore.lesson08.*;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {

        Car nissan = new Car("234");
        nissan.incLevelOfWare(45);
        nissan.changeColour("чёрный");
        Car renault = new Car("164");
        renault.changeColour("красный");
        renault.incLevelOfWare(30);
        Car bmw = new Car("469");
        bmw.incLevelOfWare(70);
        bmw.changeColour("зеленый");
        Bicycle bicycle01 = new Bicycle("842", 30, 2);
        bicycle01.incLevelOfWare(60);
        Scooter scooter = new Scooter("712", 40, true);
        scooter.incLevelOfWare(43);
        scooter.changeColour("чёрный");
        Train train01 = new Train("953", 190, 5, true);
        train01.incLevelOfWare(10);
        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put(train01.getNumber(), train01);
        vehicleMap.put(scooter.getNumber(), scooter);
        vehicleMap.put(bicycle01.getNumber(), bicycle01);
        vehicleMap.put(bmw.getNumber(), bmw);
        vehicleMap.put(renault.getNumber(), renault);
        vehicleMap.put(nissan.getNumber(), nissan);
        int level = 50;

        // проверка задание 1
        ArrayList<Vehicle> wornWheels = getLowLevelWare(vehicleMap, level);
        System.out.println(wornWheels);

        //проверка задание 2

        ArrayList<Colourable> colourables = new ArrayList<>();
        colourables.add(bmw);
        colourables.add(renault);
        colourables.add(scooter);
        colourables.add(nissan);
        EnumMap<Color, ArrayList<Colourable>> sortedByColour = new EnumMap<>(Color.class);
        vehiclesByColor(colourables, sortedByColour);
        System.out.println(sortedByColour);

        //проверка задание 3
        ArrayList<Vehicle> repairlist = new ArrayList<>();
        repairlist.addAll(wornWheels);
      // repairlist.add(null);
        Map<String, ? super Vehicle> repaired = new HashMap<>();
        repaired = getRepairedList(repairlist);
        System.out.println(repaired);

    }

    //## Задание №1.
//    Написать метод, принимающий на вход мапу и уровень износа. Ключи мапы - номера транспортных средств, значения - любые
//    транспортные средства. Метод возвращает список транспортных средств, уровень износа которых больше переданного в метод.
    private static <T extends Vehicle> ArrayList<T> getLowLevelWare(Map<String,T> vehicleMap, int level) {
        Objects.requireNonNull(vehicleMap,"Map не может быть null");
        if (level<=0)  throw new IllegalArgumentException(" level должен быть больше 0 ");
        ArrayList<T> wornWheels = new ArrayList<>();
        for (Map.Entry<String, T> vehicleEntry : vehicleMap.entrySet()) {
            if (vehicleEntry.getValue().getLevelOfWare() > level)
                wornWheels.add(vehicleEntry.getValue());
        }
        return wornWheels;
    }
//## Задание №2.
//    Написать метод, принимающий на вход список перекрашиваемых объектов и мапу, где ключи - цвета, а значения - списки
//    покрашенных в данный цвет объектов. В методе необходимо наполнить мапу элементами списка.
    private static <T extends Colourable> void vehiclesByColor(ArrayList<T> colourables, EnumMap<Color, ArrayList<T>> sortedByColour) {
        Objects.requireNonNull(colourables,"Список не может быть null");
        Objects.requireNonNull(sortedByColour,"EnumMap не может быть null");
        for (int i = 0; i < colourables.size(); i++) {
            switch (colourables.get(i).getColor()) {
                case "чёрный":
                    if (sortedByColour.get(Color.BLACK) == null) {
                        sortedByColour.put(Color.BLACK, new ArrayList<>());
                    }
                    sortedByColour.get(Color.BLACK).add((colourables.get(i)));
                    break;
                case "красный":
                    if (sortedByColour.get(Color.RED) == null) {
                        sortedByColour.put(Color.RED, new ArrayList<>());
                    }
                    sortedByColour.get(Color.RED).add((colourables.get(i)));
                    break;
                case "зеленый":
                    if (sortedByColour.get(Color.GREEN) == null) {
                        sortedByColour.put(Color.GREEN, new ArrayList<>());
                    }
                    sortedByColour.get(Color.GREEN).add((colourables.get(i)));
                    break;
            }
        }
    }

//## Задание №3.
//    Написать метод, принимающий на вход список ремонтируемых
//    транспортных средств и возвращающий мапу, где ключи - номера
//    транспортных средств, а значения - любые транспортные средства.
//    В методе необходимо вызвать метод repair транспортного
//    средства, после чего добавить транспортное средство в результирующую мапу.

    private static <T extends Vehicle> Map <String, T>  getRepairedList(ArrayList<? extends T > list) {
        Objects.requireNonNull(list,"Список не может быть null");
        Map<String, T > repaired = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==null)  throw new IllegalArgumentException("Vehicle not null");
            else list.get(i).repair();
            repaired.put(list.get(i).getNumber(), list.get(i));
        }
        return repaired;
    }
}
