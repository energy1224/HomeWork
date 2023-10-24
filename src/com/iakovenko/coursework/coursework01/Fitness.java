package com.iakovenko.coursework.coursework01;

import java.util.Arrays;

public class Fitness {

    private TrainingZone [] fitness;

    public Fitness(TrainingZone[] fitness) {
        this.fitness = fitness;
    }
//
//    @Override
//    public String toString() {
//        return "Fitness{" +
//                "swimmingPool=" + Arrays.toString(swimmingPool) +
//                ", gym=" + Arrays.toString(gym) +
//                ", groupClasses=" + Arrays.toString(groupClasses) +
//                '}';
//    }
//    public Membership[] getSwimmingPool() {
//        return swimmingPool;
//    }
//
//    public Membership[] getGym() {
//        return gym;
//    }
//
//    public Membership[] getGroupClasses() {
//        return groupClasses;
//    }


    public void addMembership(Membership[] memberships, Membership membership){
        if (memberships == null) throw new IllegalArgumentException("memberships not null");
        if (membership == null) throw new IllegalArgumentException("membership not null");
        if (memberships[memberships.length-1]!=null){
            System.out.println("Membership list is already full");
            return;
        }
        if(membership.getTypeMembership()==TypeMembership.DAY_PASS){

        }





    }


}


