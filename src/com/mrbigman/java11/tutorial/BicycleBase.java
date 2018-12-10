package com.mrbigman.java11.tutorial;

//public class BicycleBase {
//}

public class BicycleBase {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    void changeCadence(int newValue) {
        setCadence(newValue);
    }

    void changeGear(int newValue) {
        setGear(newValue);
    }

    void speedUp(int increment) {
        setSpeed(getSpeed() + increment);
    }

    void applyBrakes(int decrement) {
        setSpeed(getSpeed() - decrement);
    }

    void printStates() {
        System.out.println("cadence:" +
                getCadence() + " speed:" +
                getSpeed() + " gear:" + getGear());
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
