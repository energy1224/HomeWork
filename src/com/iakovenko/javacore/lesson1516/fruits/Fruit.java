package com.iakovenko.javacore.lesson1516.fruits;

import java.util.Objects;

// remove(index)
// add(index, object)
public class Fruit {
    private final FruitType type;
    private double price;
    private int count;

    /*принимающий конструктор, принимающий значения всех свойств + проверки*/
    public Fruit(FruitType type, double price, int count) {
        if (type == null) throw new IllegalArgumentException("type not null");
        this.type = type;
        if (price < 0) throw new IllegalArgumentException("цена не может быть отрицательной");
        this.price = price;
        if (count < 0) throw new IllegalArgumentException("количество не может быть отрицательным");
        this.count = count;
    }
    // доступные геттеры и сеттеры
    public FruitType getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    // equals + hashCode + toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.price, price) == 0 && count == fruit.count && type == fruit.type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, price, count);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }
}

