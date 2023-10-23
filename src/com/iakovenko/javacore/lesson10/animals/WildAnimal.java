package com.iakovenko.javacore.lesson10.animals;

import java.util.Objects;

public class WildAnimal extends Animal{
    private int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "strength=" + strength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WildAnimal that = (WildAnimal) o;
        return strength == that.strength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strength);
    }
}
