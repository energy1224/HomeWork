package com.iakovenko.coursework.coursework01;

import java.util.Date;

public enum TypeMembership {

    SINGLE_PASS(1,14),
    DAY_PASS(365,8),
    FULL_PASS(365, 14);

     int daysOfValidity;

     int timePeriod;

    TypeMembership(int daysOfValidity, int timePeriod) {
        this.daysOfValidity = daysOfValidity;
        this.timePeriod = timePeriod;
    }
}
