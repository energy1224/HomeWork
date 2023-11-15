package com.iakovenko.javacore.lesson19;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Task02Vehicles {
    public static void main(String[] args) {
        List<Car> vehicles = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new MiniCar(Repaintable.Color.ORANGE, "002"),
                new MiniCar(Repaintable.Color.BLACK, "003"),
                new Car(Repaintable.Color.RED, "004"),
                new Car(Repaintable.Color.BLACK, "005"),
                new MiniCar(Repaintable.Color.ORANGE, "006")
        );



        System.out.println(vehicles);

        System.out.println();
//Задание 2.1
//        1. отсортировать по уровню износа от большего к меньшему `.sorted(Comparator comparator)`
//        2. получить список номеров транспортных средств `.toList()`
        Comparator<Car> comparator =  (a,b) ->b.getLevelOfWare()- a.getLevelOfWare();
        Function< Car,String> function = a -> a.getNumber();
          List<String> byLevelOfWare= vehicles.stream()
                   .sorted(comparator)
                  .map(function)
                   .toList();
        System.out.println(byLevelOfWare);

// Задание 2.2
//        1. получить суммарный уровень износа транспортных средств
//        `.mapToInt(ToIntFunction function)` и `.sum()`
       int sum = vehicles.stream()
                .mapToInt (a->a.getLevelOfWare())
                .sum();
        System.out.println(sum);

//        ### Задание 2.3
//        1. сменить цвет каждой машины на GOLD `.peek(Consumer consumer)`
//        2. вывести каждый элемент в консоль `.foreach(Consumer consumer)`

        vehicles.stream()
                .peek(s->s.changeColor(Repaintable.Color.GOLD))
                .forEach(s-> System.out.println(s));







    }
}
