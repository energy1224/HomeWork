package com.iakovenko.javacore.lesson1516.fruits;


import java.util.*;

public class FruitsStorage {
    private int numberOfSlots;
    private ArrayList<Fruit> fruits;

    public FruitsStorage(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        fruits = new ArrayList<>();
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    // Реализация методов
    public boolean addToStorage(Fruit fruit) {
        Objects.requireNonNull(fruit, "fruit не может быть null");
        if (fruit.getCount() > numberOfSlots) {
            System.out.println("В хранилище не достаточно места для " + fruit.getCount() + " штук " + fruit.getType());
            return false;
        }
        if (fruits.size() == 0) {
            fruits.add(fruit);
            numberOfSlots -= fruit.getCount();
            return true;
        }
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i) == fruit) {
                System.out.println("Данный фрукт уже добавлен на склад");
                return false;
            }
            if (fruits.get(i).getType() == fruit.getType() && fruits.get(i).getPrice() == fruit.getPrice()) {
                fruits.get(i).setCount(fruits.get(i).getCount() + fruit.getCount());
                numberOfSlots -= fruit.getCount();
            } else {
                fruits.add(fruit);
                numberOfSlots -= fruit.getCount();
            }
            return true;
        }
        return true;
    }


    @Override
    public String toString() {
        return "FruitsStorage{" +
                "fruits=" + fruits +
                '}';
    }

    // вернуть количество фруктов определённого типа
    public int getNumberOfFruitsByType(Fruit.FruitType fruitType) {
        Objects.requireNonNull(fruitType, "fruitType не может быть null");
        int numb = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getType() == fruitType)
                numb += fruits.get(i).getCount();
        }
        return numb;
    }

    // вернуть количество свободных мест в хранилище
    public int getNumberOfEmptySlots() {
        return getNumberOfSlots();
    }

    public void increasePrice(int value) {
        if (value >= 10 && value < 30) {
            for (int i = 0; i < fruits.size(); i++) {
                double newPrice = fruits.get(i).getPrice() + fruits.get(i).getPrice() * value / 100;
                fruits.get(i).setPrice(newPrice);
            }
        } else System.out.println("Цена должна быть в диапазоне [10; 30)");
        // value может быть в диапазоне [10; 30)
        // увеличить цену всех фруктов на value процентов
    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice) {
        List<Fruit> fruitList = new ArrayList<>();
        Objects.requireNonNull(fruitType, "fruitType не может быть null");
        if (maxPrice < 0) throw new IllegalArgumentException("Цена должна быть положительной величиной");
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getType() == fruitType && fruits.get(i).getPrice() <= maxPrice)
                fruitList.add(fruits.get(i));
        }
        // maxPrice должна быть положительной, fruitType не null
        // возвращает список, в который войдут фрукты из коллекции fruits
        // с типом fruitType и ценой не выше maxPrice
        return fruitList;
    }

    public Set<Fruit.FruitType> getFruitTypes() {
        Set<Fruit.FruitType> fruitTypeSet= new HashSet<>();
        for (int i = 0; i < fruits.size(); i++)
            fruitTypeSet.add(fruits.get(i).getType());
        // возвращает ссылку на множество с типами фруктов в хранилище
        return fruitTypeSet;
    }

    public double getMinPriceByType(Fruit.FruitType fruitType) {
        Objects.requireNonNull(fruitType, "fruitType не может быть null");
        // вернуть минимальную цену фрукта с типом fruitType
        List<Fruit> fruitList = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getType() == fruitType)
               fruitList.add(fruits.get(i));
        }
        double minPrice=fruitList.get(0).getPrice();
        for (int i = 1; i < fruitList.size(); i++) {
            if(fruitList.get(i).getPrice()<minPrice)
                minPrice=fruitList.get(i).getPrice();
        }
        return minPrice;
    }
}
