package com.iakovenko.javacore.lesson1516.fruits;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Fruit banana01 = new Fruit(Fruit.FruitType.BANANA, 100, 10);
        Fruit banana02 = new Fruit(Fruit.FruitType.BANANA, 100, 100);
        Fruit banana03 = new Fruit(Fruit.FruitType.BANANA, 10, 100);
        Fruit pear = new Fruit(Fruit.FruitType.PEAR, 100, 10);
        Fruit apple = new Fruit(Fruit.FruitType.APPLE, 100, 10);

        FruitsStorage fruitsStorage = new FruitsStorage(500);
        boolean isAdded;

        isAdded = fruitsStorage.addToStorage(banana01);
        System.out.println(isAdded);
        isAdded = fruitsStorage.addToStorage(banana03);
        System.out.println(isAdded);
        isAdded = fruitsStorage.addToStorage(banana02);
        System.out.println(isAdded);
        isAdded = fruitsStorage.addToStorage(pear);
        System.out.println(isAdded);


        System.out.println(fruitsStorage.getNumberOfFruitsByType(Fruit.FruitType.BANANA));


        int emptyslots = fruitsStorage.getNumberOfEmptySlots();
        System.out.println(emptyslots);

        fruitsStorage.increasePrice(9);

        System.out.println(fruitsStorage);

        System.out.println( fruitsStorage.getFruitsByTypeAndPrice(Fruit.FruitType.BANANA, 90));

        Set<Fruit.FruitType> fruitTypeSet/*= new HashSet<>()*/;

        fruitTypeSet=fruitsStorage.getFruitTypes();

        System.out.println(fruitTypeSet);


        double minPrice= fruitsStorage.getMinPriceByType(Fruit.FruitType.BANANA);

        System.out.println(minPrice);







    }
}
