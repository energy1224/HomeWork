package com.iakovenko.coursework.coursework01;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        Holder holder01 = new Holder("Bob","Dilan", 1945);
        LocalDateTime someDateTime = LocalDateTime.of(2022, 1, 20, 22, 30);
        Membership mb1 = new Membership(TypeMembership.SINGLE_PASS,someDateTime,holder01 );
        //   System.out.println(mb1);
        //  TrainingZone trainingZone1 = new TrainingZone(Zone.GYM);// хочу сделать создание тренировочной зоны только через конструктор фитнеса
        //    System.out.println(mb1.getTypeMembership().daysOfValidity);


        Fitness sportlife= new Fitness("SportLife");

        Fitness sportlife1= new Fitness("SportLife1");
     //   System.out.println(sportlife.getGym());
        System.out.println(sportlife);
    //    System.out.println();
     //  System.out.println(sportlife.getGroupClasses());
//        System.out.println(Sportlife.getGym());
//        System.out.println(Sportlife.getSwimmingPool());

        System.out.println();

        sportlife.addMembership(sportlife.getGym(),mb1);

        System.out.println(sportlife);

        System.out.println();
        System.out.println(sportlife1);

        System.out.println(sportlife.getGym());
        System.out.println(sportlife1.getGym());

      //  sportlife.addMembership(sportlife.getGroupClasses(),mb1);

        System.out.println();

      //  System.out.println(sportlife.getGroupClasses());

//        LocalDate currentDate = LocalDate.now();
//
//        System.out.println(currentDate.getYear()); // год








    }
}
