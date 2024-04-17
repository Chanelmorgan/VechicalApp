/***********************************************************************************************************************

 File        : Main.java

 Date        : Wednesday 17th April

 Author      : Chanel Morgan

 Description : Main class for running the program that creates the car and runs the move methods on it

 History     : 17/04/2024 - v1.00

 Copyright   : (c) Chanel Morgan, April 2024.

 **********************************************************************************************************************/


public class Main {

    public static void main(String[] args) {
	// Testing

        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(40, 0);
        fortuner.accelerate(20);
        fortuner.accelerate(-60); // car will be stopped
        System.out.println("Current gear: " + fortuner.getCurrentGear());
        System.out.println("Current speed: " + fortuner.getCurrentSpeed());
    }
}
