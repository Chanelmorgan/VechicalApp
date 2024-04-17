/***********************************************************************************************************************

 File        : Car.java

 Date        : Wednesday 17th April

 @author      : Chanel Morgan

 Description : Class that represents a Car and extends the vehicle class

 History     : 17/04/2024 - v1.00

 Copyright   : (c) Chanel Morgan, April 2024.

 **********************************************************************************************************************/
public class Car extends Vehicle{

    // Class variables
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;


    // Constructor
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        super(name);
        this.type = type;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.wheels = wheels;
        this.currentGear = 1;
    }

    // Getters and setters
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    /**
     *Method to change the gear of the car
     * @param  newGear that moves the car into the new gear
     */
    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("Change gear method is called: Changed to " + this.currentGear + " gear.");

    }

    /**
     *Method to increase the speed of the car
     * @param  newSpeed the new speed that the car is moving at
     * @param newDirection this is the new direction in the
     */
    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("Change speed method is called: Speed -> " + newSpeed + " Direction -> " + newDirection);
    }






}
