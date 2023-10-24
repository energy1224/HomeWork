package com.iakovenko.coursework.coursework01;

import java.util.Date;

public class Membership  {

    TypeMembership typeMembership;
    private int id;

    private int registrationDate;

    private int expirationDate;

    private Holder holder;


    public Membership(TypeMembership typeMembership, int id, int registrationDate, int expirationDate, Holder holder) {
        this.typeMembership = typeMembership;
        this.id = id;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "typeMembership=" + typeMembership +
                ", id=" + id +
                ", registrationDate=" + registrationDate +
                ", expirationDate=" + expirationDate +
                ", holder=" + holder +
                '}';
    }

    public TypeMembership getTypeMembership() {
        return typeMembership;
    }

    public void setTypeMembership(TypeMembership typeMembership) {
        this.typeMembership = typeMembership;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }
}