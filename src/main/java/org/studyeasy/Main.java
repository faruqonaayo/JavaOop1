package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        // car1 uses the custom default constructor
        Car car1 = new Car();

        //car2 uses the constructor used to initialize the class data members
        Car car2 = new Car("closed","on","seated",10);

//        car.setDoors("closed");
//        car.setDriver("seated");
//        car.setEngine("off");
//        car.setSpeed(30);
        System.out.println(car1.run());
        System.out.println(car2.run());
    }
}