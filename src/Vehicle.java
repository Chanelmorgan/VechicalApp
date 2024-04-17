/***********************************************************************************************************************

 File        : Vehicle.java

 Date        : Wednesday 17th April

 @author      : Chanel Morgan

 Description : Class that represents a vehicle

 History     : 17/04/2024 - v1.00

 Copyright   : (c) Chanel Morgan, April 2024.

 **********************************************************************************************************************/
public class Vehicle {

    // Variables
    private String name;
    private int currentSpeed;
    private int currentDirection;


    // Constructor
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }


    /**
     *Method to change the direction and steer the vehicle
     * @param  direction that the car is being moved in degrees
     */
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Steer method called: Steering at "+ currentDirection + " degrees.");
    }


    /**
     *Method to move the vehicle
     * @param speed that the car is moving in
     * @param direction that the car is moving in
     */
    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Move method called: Movning at " + currentSpeed + " in direction " + currentDirection);
    }

    /**
     *Method to stop the vehicle from moving
     */
    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle is stopped");
    }






}
