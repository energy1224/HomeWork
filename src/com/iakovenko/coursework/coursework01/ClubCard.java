package com.iakovenko.coursework.coursework01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ClubCard {
    private static int idMaker = 1;
    private TypeMembership typeMembership;
    private int idHolder;
    private LocalDate registrationDate;
    private LocalDate expirationDate;
    private Holder holder;
    private boolean isTraining;  // false

    public ClubCard(TypeMembership typeMembership, Holder holder) {
        this.typeMembership = typeMembership;
        idHolder = idMaker;
        idMaker++;
        registrationDate = LocalDate.now();
        expirationDate = registrationDate.plusDays(typeMembership.daysOfValidity);
        this.holder = holder;
    }



    public void setTraining(boolean training) {
        isTraining = training;
    }

    public boolean isExpired() {
        LocalDate nowDate = LocalDate.now();
        boolean isExpired;
        if(nowDate.equals(expirationDate) || nowDate.isBefore(expirationDate)) isExpired=false;
        else isExpired =true;
//       если  false - абонемент не просрочен
//       если true - абонемент просрочен
        return isExpired;

    }

    public boolean checkPermittedTime() {
        LocalTime nowTime = LocalTime.now();
        boolean isPermittedTime;
        //      если  false - не разрешено по времени
        //       если true - разрешено
        if (nowTime.isBefore(typeMembership.timeIn) || nowTime.isAfter(typeMembership.timeOut)) isPermittedTime = false;
        else isPermittedTime = true;
        return isPermittedTime;
    }


    public boolean isTraining() {
        return isTraining;
    }

    public TypeMembership getTypeMembership() {
        return typeMembership;
    }

    public Holder getHolder() {
        return holder;
    }


}