package com.iakovenko.coursework.coursework01;

public class Application {

    public static void main(String[] args) {

        Holder holder01 = new Holder("Bob","Dilan", 1945);
        Membership mb1 = new Membership(TypeMembership.DAY_PASS,123,12,15,holder01);
        TrainingZone trainingZone1 = new TrainingZone(Zone.GYM);
        TrainingZone trainingZone2 = new TrainingZone(Zone.GROUP_CLASSES);
        TrainingZone trainingZone3 = new TrainingZone(Zone.SWIMMING_POOL);

        System.out.println(trainingZone1);




    }
}
