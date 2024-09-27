package org.studyeasy;

public class Car {
//    assigning the variables as a private entity to make them secure.
//    all unassigned data members are given a default value buy the default class constructor
//    if no custom constructor is provided by the programmer the default constructor is provided by java automatically
//    OOP is very important because real life objects and entities can be represented in a computer program.


    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String run () {
        if (doors.equalsIgnoreCase("closed") && engine.equalsIgnoreCase("on") && driver.equalsIgnoreCase("seated") && speed>0){
            return "running";
        }else {
            return "not running";
        }
    }
}
