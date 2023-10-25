package com.iakovenko.coursework.coursework01;

import java.util.Arrays;

public class Fitness {
  //  private final int numberOfZones = 3;
    private String name;

   // private TrainingZone ;

    public Fitness(String name) {
        this.name=name;
        TrainingZone gym =new TrainingZone(Zone.GYM);
        TrainingZone swimmingPool =new TrainingZone(Zone.SWIMMING_POOL);
        TrainingZone groupClasses =new TrainingZone(Zone.GROUP_CLASSES);
    }




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


