package com.iakovenko.coursework.coursework01;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainingZone  {
    private final int numberOfHolders = 20;
    private ZoneName name;
    private Membership[] registrationList;
    private ArrayList<TypeMembership> permitedTypeMembership;

    TrainingZone(ZoneName name) {
        this.name = name;
        registrationList = new Membership[numberOfHolders];
        if (name == ZoneName.SWIMMING_POOL) permitedTypeMembership = new ArrayList<TypeMembership>() {
            {
                add(TypeMembership.SINGLE_PASS);
                add(TypeMembership.FULL_PASS);
            }
        };
        if (name == ZoneName.GYM) permitedTypeMembership = new ArrayList<TypeMembership>() {
            {
                add(TypeMembership.SINGLE_PASS);
                add(TypeMembership.DAY_PASS);
                add(TypeMembership.FULL_PASS);
            }
        };
        if (name == ZoneName.GROUP_CLASSES)
            permitedTypeMembership = new ArrayList<TypeMembership>() {
                {
                    add(TypeMembership.FULL_PASS);
                    add(TypeMembership.DAY_PASS);
                }
            };
    }



        public ZoneName getName () {
            return name;
        }

        public Membership[] getRegistrationList() {
            return registrationList;
        }

        public ArrayList<TypeMembership> getpermitedTypeMembership() {
            return permitedTypeMembership;
        }

    @Override
    public String toString() {
        return "TrainingZone{" +
                "numberOfHolders=" + numberOfHolders +
                ", name=" + name +
                ", registrationList=" + Arrays.toString(registrationList) +
                ", permitedTypeMembership=" + permitedTypeMembership +
                '}';
    }
        }

