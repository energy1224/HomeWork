package com.iakovenko.javacore.lesson08;

public class Train extends Vehicle {
    private int carCount;
    private boolean isClimateControl;

    public Train(String number, int maxSpeed,
                 int carCount, boolean isClimateControl) {
        super(number, maxSpeed);
        this.carCount = carCount;
        this.isClimateControl = isClimateControl;
    }

    public void changeClimateControl() {
        isClimateControl = !isClimateControl;
    }

    public int getCarCount() {
        return carCount;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }


    @Override
    public void repair() {
        if (carCount < 7 && carCount > 0) {
            if (levelOfWare >= 2) levelOfWare -= 2;
        } else {
            super.repair();

        }
    }
}
