package com.iakovenko.coursework.coursework01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Membership {

    private static ArrayList<Integer> idList=new ArrayList<>(){{add(0);}};

    private TypeMembership typeMembership;
    private int id;

    private LocalDateTime registrationDate;

    private  LocalDateTime  expirationDate;

    private Holder holder;

    private boolean isTraining;  // false

    public Membership(TypeMembership typeMembership,LocalDateTime registrationDate, Holder holder) {
        this.typeMembership = typeMembership;
        // генерация случайного id
        while (id == 0) {
            int x = (int) ((Math.random() * (99999 - 10000)) + 10000);
            if (!idList.contains(x)) {
                idList.add(x);
                id = x;
            }
        }
        this.registrationDate = registrationDate;

        if(typeMembership.daysOfValidity == 365) expirationDate = registrationDate.plusDays(365);
        else expirationDate = registrationDate;

        this.holder = holder;

        }

        @Override
        public String toString () {
            return "Membership{" +
                    "typeMembership=" + typeMembership +
                    ", id=" + id +
                    ", registrationDate=" + registrationDate +
                    ", expirationDate=" + expirationDate +
                    ", holder=" + holder +
                    '}';
        }

        public void setTraining(boolean training){
            isTraining = training;
        }

        public boolean isTraining() {
            return isTraining;
        }

        public TypeMembership getTypeMembership () {
            return typeMembership;
        }

        public int getId () {
            return id;
        }

        public LocalDateTime getRegistrationDate () {
            return registrationDate;
        }

        public LocalDateTime getExpirationDate () {
            return expirationDate;
        }

        public Holder getHolder () {
            return holder;
        }


    }