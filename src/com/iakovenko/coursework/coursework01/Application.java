package com.iakovenko.coursework.coursework01;

public class Application {

    public static void main(String[] args) {

        Holder holder01 = new Holder("Bob","Milan", 1999);
        ClubCard mb1 = new ClubCard(TypeMembership.FULL_PASS,holder01 );
        Fitness sportlife = new Fitness("SportLife");

        sportlife.addMembership(sportlife.getGym(), mb1);

       sportlife.printCurrentVisitors();

       sportlife.setRegistrationListDefault(sportlife.getGym());

        sportlife.printCurrentVisitors();

























    }
}
