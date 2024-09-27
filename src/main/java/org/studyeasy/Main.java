package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("off");
        car.setSpeed(30);
        System.out.println(car.run());
    }
}