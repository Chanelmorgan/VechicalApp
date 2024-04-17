/***********************************************************************************************************************

 File        : SUV.java

 Date        : Wednesday 17th April

 Author      : Chanel Morgan

 Description : SUV represents an SUV car, with 4 wheels, 5 doors and 6 gears

 History     : 17/04/2024 - v1.00

 Copyright   : (c) Chanel Morgan, April 2024.

 **********************************************************************************************************************/
public class SUV extends Car{

    // Constructor
    public SUV(String name, boolean isManual) {
        super(name, 4, 5, 6, isManual, "SUV");
    }

    /**
     * Accelerates the suv, by a rate giving, and increases to the appropriate gear
     * @param rate that the suv is accelerating
     */
    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;
        /**
         * speed = 0 : gear 1
         * speed 0 - 10 : gear 1
         * speed 10 - 20 : gear 2
         * speed 20 - 30 : gear 3
         * speed 30 - 50 : gear 4
         * speed 50 - 70 : gear 5
         * 6
         */

        if(newSpeed == 0) {
            stop();
            changeGear(1);
        } else if(newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        }
        else if(newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        }
        else if(newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        }
        else if(newSpeed > 30 && newSpeed <= 50) {
            changeGear(4);
        }
        else if(newSpeed > 50 && newSpeed <= 70) {
            changeGear(5);
        } else{
            changeGear(6);
        }

        if(newSpeed >0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
