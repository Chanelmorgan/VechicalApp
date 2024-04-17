public class Car extends Vehicle{

    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;


    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        super(name);
        this.type = type;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.wheels = wheels;
        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("Change gear method is called: Changed to " + this.currentGear + " gear.");

    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("Change speed method is called: Speed -> " + newSpeed + " Direction -> " + newDirection);
    }




}