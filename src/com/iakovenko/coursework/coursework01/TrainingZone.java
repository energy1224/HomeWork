package com.iakovenko.coursework.coursework01;

import java.util.Arrays;

public class TrainingZone implements Fillable {
    private final int numberOfHolders = 20;
    private Zone name;
    private Membership[] zone;
    private TypeMembership[] typeMembership;
    public TrainingZone(Zone name) {
        this.name = name;
        zone = new Membership[numberOfHolders];
        if (name == Zone.SWIMMING_POOL)
            typeMembership = new TypeMembership[]{TypeMembership.SINGLE_PASS, TypeMembership.FULL_PASS};
        if (name == Zone.GYM)
            typeMembership = new TypeMembership[]{TypeMembership.SINGLE_PASS, TypeMembership.FULL_PASS,TypeMembership.DAY_PASS};
        if (name == Zone.GROUP_CLASSES)
            typeMembership = new TypeMembership[]{TypeMembership.FULL_PASS,TypeMembership.DAY_PASS};
    }

    @Override
    public String toString() {
        return "TrainingZone{" +
                "numberOfHolders=" + numberOfHolders +
                ", name=" + name +
                ", zone=" + Arrays.toString(zone) +
                ", typeMembership=" + Arrays.toString(typeMembership) +
                '}';
    }

    @Override
    public void setDefaultValues() {

    }

    @Override
    public void addMembership(Membership[] list, Membership member) {

    }
}
