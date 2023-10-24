package com.iakovenko.javacore.lesson10.animals;

import java.util.Arrays;
import java.util.Objects;

public class Wolf extends WildAnimal{
    private final String[] likeToEat;
    private final String color;

    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Wolf{" +
                "likeToEat=" + Arrays.toString(likeToEat) +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wolf wolf = (Wolf) o;
//        if(this.getStrength() != wolf.getStrength());
//        if(this.getName() != wolf.getName());
//        if(this.getAge() != wolf.getAge());
        return Arrays.equals(likeToEat, wolf.likeToEat) && Objects.equals(color, wolf.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), color);
        result = 31 * result + Arrays.hashCode(likeToEat);
        return result;
    }
}
