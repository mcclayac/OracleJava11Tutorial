package com.mrbigman.java11.tutorial;

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different
        // BicycleBase objects
        BicycleBase bike1 = new BicycleBase();
        BicycleBase bike2 = new BicycleBase();
        BicycleBase bike3 = new BicycleBase();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

        bike3.changeCadence(25);
        bike3.speedUp(50);
        bike3.changeGear(4);
        bike3.printStates();
    }
}
