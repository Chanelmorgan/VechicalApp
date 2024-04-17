public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }


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

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Steer method called: Steering at "+ currentDirection + " degrees.");
    }

    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Move method called: Movning at " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("Vehicle is stopped");
    }






}
