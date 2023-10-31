package com.iakovenko.coursework.coursework01;

import java.time.LocalTime;
import java.util.ArrayList;

public enum TypeMembership {
    SINGLE_PASS(0, LocalTime.of(8, 00), LocalTime.of(22, 00),
            new ArrayList<>() {
                {
                    add(TrainingZoneName.GROUP_CLASSES);
                    add(TrainingZoneName.SWIMMING_POOL);
                    add(TrainingZoneName.GYM);
                }
            }
    ),
    DAY_PASS(365, LocalTime.of(8, 00), LocalTime.of(16, 00),
            new ArrayList<>() {
                {
                    add(TrainingZoneName.GROUP_CLASSES);
                    add(TrainingZoneName.GYM);
                }
            }
    ),
    FULL_PASS(365, LocalTime.of(8, 00), LocalTime.of(22, 00),
            new ArrayList<>() {
                {
                    add(TrainingZoneName.GROUP_CLASSES);
                    add(TrainingZoneName.SWIMMING_POOL);
                    add(TrainingZoneName.GYM);
                }
            });
    int daysOfValidity;
    LocalTime timeIn;
    LocalTime timeOut;


    ArrayList<TrainingZoneName> permittedTrainingZone;


    TypeMembership(int daysOfValidity, LocalTime timeIn, LocalTime timeOut, ArrayList<TrainingZoneName> permittedTrainingZone) {
        this.daysOfValidity = daysOfValidity;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.permittedTrainingZone = permittedTrainingZone;

    }


}
