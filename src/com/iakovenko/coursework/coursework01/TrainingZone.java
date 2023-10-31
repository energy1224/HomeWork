package com.iakovenko.coursework.coursework01;

import java.util.Arrays;

public class TrainingZone  {
    private final int numberOfHolders = 20;
    private TrainingZoneName name;
    private ClubCard[] registrationList;
    TrainingZone(TrainingZoneName name) {
        this.name = name;
        registrationList = new ClubCard[numberOfHolders];

    }


    public TrainingZoneName getName () {
            return name;
        }

        public ClubCard[] getRegistrationList() {
            return registrationList;
        }


        }

